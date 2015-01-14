package br.com.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "questionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questionario.findAll", query = "SELECT q FROM Questionario q"),
    @NamedQuery(name = "Questionario.findByAvaliaExpectativa", query = "SELECT q FROM Questionario q WHERE q.avaliaExpectativa = :avaliaExpectativa"),
    @NamedQuery(name = "Questionario.findByAvaliaRealizacao", query = "SELECT q FROM Questionario q WHERE q.avaliaRealizacao = :avaliaRealizacao"),
    @NamedQuery(name = "Questionario.findByConteudoAdequado", query = "SELECT q FROM Questionario q WHERE q.conteudoAdequado = :conteudoAdequado"),
    @NamedQuery(name = "Questionario.findByAplicacaoCurso", query = "SELECT q FROM Questionario q WHERE q.aplicacaoCurso = :aplicacaoCurso"),
    @NamedQuery(name = "Questionario.findByConteudoIntrutor", query = "SELECT q FROM Questionario q WHERE q.conteudoIntrutor = :conteudoIntrutor"),
    @NamedQuery(name = "Questionario.findByAtencaoAlunos", query = "SELECT q FROM Questionario q WHERE q.atencaoAlunos = :atencaoAlunos"),
    @NamedQuery(name = "Questionario.findByFaltasAlunos", query = "SELECT q FROM Questionario q WHERE q.faltasAlunos = :faltasAlunos"),
    @NamedQuery(name = "Questionario.findByInteresseCursos", query = "SELECT q FROM Questionario q WHERE q.interesseCursos = :interesseCursos"),
    @NamedQuery(name = "Questionario.findByAprofundamentoCurso", query = "SELECT q FROM Questionario q WHERE q.aprofundamentoCurso = :aprofundamentoCurso"),
    @NamedQuery(name = "Questionario.findByIdCurso", query = "SELECT q FROM Questionario q WHERE q.idCurso = :idCurso")})
public class Questionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "nome_curso", nullable = false, length = 65535)
    private String nomeCurso;
    @Basic(optional = false)
    @Column(name = "avalia_expectativa", nullable = false)
    private int avaliaExpectativa;
    @Basic(optional = false)
    @Column(name = "avalia_realizacao", nullable = false)
    private int avaliaRealizacao;
    @Basic(optional = false)
    @Column(name = "conteudo_adequado", nullable = false)
    private short conteudoAdequado;
    @Column(name = "aplicacao_curso")
    private Short aplicacaoCurso;
    @Column(name = "conteudo_intrutor")
    private Short conteudoIntrutor;
    @Column(name = "atencao_alunos")
    private Short atencaoAlunos;
    @Column(name = "faltas_alunos")
    private Short faltasAlunos;
    @Column(name = "interesse_cursos")
    private Short interesseCursos;
    @Column(name = "aprofundamento_curso")
    private Short aprofundamentoCurso;
    @Lob
    @Column(name = "comentarios_curso", length = 65535)
    private String comentariosCurso;
    @Id
    @Basic(optional = false)
    @Column(name = "id_curso", nullable = false)
    private Integer idCurso;

    public Questionario() {
    }

    
    
    public Questionario(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public Questionario(Integer idCurso, String nomeCurso, int avaliaExpectativa, int avaliaRealizacao, short conteudoAdequado) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.avaliaExpectativa = avaliaExpectativa;
        this.avaliaRealizacao = avaliaRealizacao;
        this.conteudoAdequado = conteudoAdequado;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAvaliaExpectativa() {
        return avaliaExpectativa;
    }

    public void setAvaliaExpectativa(int avaliaExpectativa) {
        this.avaliaExpectativa = avaliaExpectativa;
    }

    public int getAvaliaRealizacao() {
        return avaliaRealizacao;
    }

    public void setAvaliaRealizacao(int avaliaRealizacao) {
        this.avaliaRealizacao = avaliaRealizacao;
    }

    public short getConteudoAdequado() {
        return conteudoAdequado;
    }

    public void setConteudoAdequado(short conteudoAdequado) {
        this.conteudoAdequado = conteudoAdequado;
    }

    public Short getAplicacaoCurso() {
        return aplicacaoCurso;
    }

    public void setAplicacaoCurso(Short aplicacaoCurso) {
        this.aplicacaoCurso = aplicacaoCurso;
    }

    public Short getConteudoIntrutor() {
        return conteudoIntrutor;
    }

    public void setConteudoIntrutor(Short conteudoIntrutor) {
        this.conteudoIntrutor = conteudoIntrutor;
    }

    public Short getAtencaoAlunos() {
        return atencaoAlunos;
    }

    public void setAtencaoAlunos(Short atencaoAlunos) {
        this.atencaoAlunos = atencaoAlunos;
    }

    public Short getFaltasAlunos() {
        return faltasAlunos;
    }

    public void setFaltasAlunos(Short faltasAlunos) {
        this.faltasAlunos = faltasAlunos;
    }

    public Short getInteresseCursos() {
        return interesseCursos;
    }

    public void setInteresseCursos(Short interesseCursos) {
        this.interesseCursos = interesseCursos;
    }

    public Short getAprofundamentoCurso() {
        return aprofundamentoCurso;
    }

    public void setAprofundamentoCurso(Short aprofundamentoCurso) {
        this.aprofundamentoCurso = aprofundamentoCurso;
    }

    public String getComentariosCurso() {
        return comentariosCurso;
    }

    public void setComentariosCurso(String comentariosCurso) {
        this.comentariosCurso = comentariosCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Questionario)) {
            return false;
        }
        Questionario other = (Questionario) object;
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.DAO.Questionario[ idCurso=" + idCurso + " ]";
    }
    
}
