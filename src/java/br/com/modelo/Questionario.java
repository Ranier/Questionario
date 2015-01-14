package br.com.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

    /*
     Abaixo Lista para percorrer o questionario;
     Podemos chamar Ex:. lista.getNomeCurso...
     */
    List<Questionario> lista = new ArrayList<Questionario>();

    private double mediaAvaliaExpectativa = 0;
    private double mediaAvaliaRealizacao = 0;
    private double mediaNotaTreinamento = 0;
    private double mediaNotaConteudo = 0;
    private double mediaPositivaConteudo = 0;
    private double mediaExpectativaAtendida = 0;
    private double gapMedio = 0;
    private double percentualVerdadeira = 0;

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
    /*
     No método abaixo deve ser recebido por parâmetro 2 dados
     - a soma de toda a pontuação e a quantidade respondido.
     O calculo é feito da seguinte forma.
     Soma de todas as pontuações divido pela soma da quantidade de respostas.
     Este valor é atribuído à variável avaliaMediaExpectativa.
     */

    /*
     Neste método eu também posso entrar com 2 parâmetros
     um que me retorna do banco de dados uma soma da coluna avalia_expectativa
     que pode ser lançado em uma variável do tipo int,
     e outro parametro que pode vir do banco de dados que faz o "count" 
     a contagem de linhas, já que este campo é obrigatório a contagem será exata,
     este valor obtido do banco de dados pode ser atribuido a uma variável do tipo int.
     com estes 2 parâmetros, pode se executar o método praticamente do mesmo formato
     que está apresentado abaixo.
     */
    public double mediaAvaliaExpectativa() {

        /*
         Este laço percorre um lista de questionario
         pegando os valores solicitados do curso selecionado. Ex:. lista.getNota.
         Obs:. Deve se utilizar do método findQuestionarioPorCurso para se percorrer
         a lista somente da Query criada com o IdCurso Escolhido.
         Ex:. select*from questionario where idCurso = ?; (onde ? é o IdCurso desejado) 
         */
        for (int i = 0; i <= listacurso.size(); i++) {
            float somanota = +listacurso.getNota();
            float somaqtde = +somaqtde;
        }

        /*
         Não tem como existir divisão por 0(zero neste caso,
         porque se fizer interação, dividendo já será 1)
         */
        mediaAvaliaExpectativa = somanota / somaqtde;

        //Este retorno é a media solicitada.
        return mediaAvaliaExpectativa;
    }
    /*
     Os comentários do método mediaAvaliaExpectativa (acima) servem
     praticamente para o método mediaAvaliaRealizacao (abaixo).
     */

    public double mediaAvaliaRealizacao() {
        for (int i = 0; i <= listacurso.size(); i++) {
            float somanota = +listacurso.getNota();
            float somaqtde = +somaqtde;
        }

        /*
         Não tem como existir divisão por 0(zero neste caso,
         porque se fizer interação, dividendo já será 1)
         */
        mediaAvaliaRealizacao = somanota / somaqtde;

        //Este retorno é a media solicitada.
        return mediaAvaliaRealizacao;

    }

    /*
     Os comentários do método mediaAvaliaExpectativa (acima) servem
     praticamente para o método mediaNotaTreinamento (abaixo).
     */
    public double mediaNotaTreinamento() {
        for (int i = 0; i <= listacurso.size(); i++) {
            float somanota = +listacurso.getNota();
            float somaqtde = +somaqtde;
        }

        /*
         Não tem como existir divisão por 0(zero neste caso,
         porque se fizer interação, dividendo já será 1)
         */
        mediaNotaTreinamento = somanota / somaqtde;

        //Este retorno é a media solicitada.
        return mediaNotaTreinamento;
    }

    /*
     Os comentários do método mediaAvaliaExpectativa (acima) servem
     praticamente para o método mediaNotaTreinamento (abaixo).
     */
    public double mediaNotaConteudo() {

        for (int i = 0; i <= listacurso.size(); i++) {
            float somanota = +listacurso.getNota();
            float somaqtde = +somaqtde;
        }

        /*
         Não tem como existir divisão por 0(zero neste caso,
         porque se fizer interação, dividendo já será 1)
         */
        mediaNotaConteudo = somanota / somaqtde;

        //Este retorno é a media solicitada.
        return mediaNotaConteudo;

    }

    public double mediaPositivaConteudo() {
        /*
         Neste método deve ser feito:
         select count(conteudo_adequado)FROM questionario
         WHERE conteudo_adequado = true (ou 1); 
         com o dado acima temos de todas as respostas as positivas.
         atribuimos este valor à uma variável local...
         Int somaPositiva = valor do select count...
         Int totalRespostasConteudo = valor do select count questioario (trazendo a soma de todos os registros)
        
         Logo:.
         mediaPositivaConteudo = somaPositiva/totalRespostasConteudo;
         
         */

        return mediaPositivaConteudo;
    }

    public double mediaExpectativaAtendida() {
        //Comentario no local da avaliação
        return mediaExpectativaAtendida;

    }

    public double gapMedio() {
        //Comentario no local da avaliação
        return gapMedio;

    }

    public double percentualVerdadeira() {
        //Comentario no local da avaliação
        return percentualVerdadeira;

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
