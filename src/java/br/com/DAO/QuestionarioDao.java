
package br.com.DAO;

import br.com.modelo.Questionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QuestionarioDao {
    
    
    public void persist(Questionario questionario) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Questionario_ReacaoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(questionario);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
}
