/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.persistencia;

import br.com.modelo.Questionario;
import br.com.questionario.servlets.exceptions.NonexistentEntityException;
import br.com.questionario.servlets.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Adélia Acácio
 */
public class QuestionarioJpaController implements Serializable {

    public QuestionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Questionario questionario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(questionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findQuestionario(questionario.getIdCurso()) != null) {
                throw new PreexistingEntityException("Questionario " + questionario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Questionario questionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            questionario = em.merge(questionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = questionario.getIdCurso();
                if (findQuestionario(id) == null) {
                    throw new NonexistentEntityException("The questionario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Questionario questionario;
            try {
                questionario = em.getReference(Questionario.class, id);
                questionario.getIdCurso();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The questionario with id " + id + " no longer exists.", enfe);
            }
            em.remove(questionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Questionario> findQuestionarioEntities() {
        return findQuestionarioEntities(true, -1, -1);
    }

    public List<Questionario> findQuestionarioEntities(int maxResults, int firstResult) {
        return findQuestionarioEntities(false, maxResults, firstResult);
    }

    private List<Questionario> findQuestionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Questionario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Questionario findQuestionarioPorCurso(Integer Idcurso) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery qc = em.getCriteriaBuilder().createQuery();
            qc.select(qc.from(Questionario.class));
            Query q = em.createQuery(qc);
            //O retorno deve ser todas as occorencias que tem este ID.
            return em.find(Questionario.class, Idcurso);
        } finally {
            em.close();
        }
    }

    public Questionario findQuestionario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Questionario.class, id);
        } finally {
            em.close();
        }
    }

    public int getQuestionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Questionario> rt = cq.from(Questionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
