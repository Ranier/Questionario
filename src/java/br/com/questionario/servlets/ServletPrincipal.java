package br.com.questionario.servlets;

import br.com.DAO.QuestionarioDao;
import br.com.modelo.Questionario;
import java.io.IOException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.persistencia.QuestionarioJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServletPrincipal extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {

        String nomeCurso = request.getParameter("NomeCurso");
        String avaliaExpectativa = request.getParameter("avaliaExpectativa");
        String avaliaRealizacao = request.getParameter("avaliaRealizacao");
        String avaliaInstrutor = request.getParameter("avaliaInstrutor");

        request.setAttribute("Questionario_Reacao", "Curso: " + nomeCurso
                + " Nota Expectativa: " + avaliaExpectativa
                + " Nota Realização: " + avaliaRealizacao
                + " Nota Instrutor: " + avaliaInstrutor);

        request.getRequestDispatcher("Index.jsp").forward(request, response);

        EntityManagerFactory EmFactory = Persistence.createEntityManagerFactory("Questionario_ReacaoPU");

        Questionario q = new Questionario();

        QuestionarioJpaController controle = new QuestionarioJpaController(EmFactory);

        controle.create(q);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServletPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ServletPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
