package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Questionário Reação</title>\n");
      out.write("        <script src=\"validacao_formulario.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>QUESTIONÁRIO DE REAÇÃO</h1>\n");
      out.write("        <form name=\"Formulario1\" action=\"ServletPrincipal\" method=\"POST\">\n");
      out.write("            <label> Nome do Curso: </label><input type=\"text\" name=\"NomeCurso\" value=\"\" size=\"100\" />\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"comboBoxExpectativa\">  \n");
      out.write("                <label>  \n");
      out.write("                    Como você avaliaria sua expectativa em relação ao curso?  \n");
      out.write("                    <select name=\"avaliaEpectativa\" size=\"0\">  \n");
      out.write("                        <option selected=\"selecaoExpectativa\">Escolha</option>  \n");
      out.write("                        <option  value=\"0\">0</option>  \n");
      out.write("                        <option  value=\"1\">1</option>  \n");
      out.write("                        <option  value=\"2\">2</option>  \n");
      out.write("                        <option  value=\"3\">3</option>  \n");
      out.write("                        <option  value=\"4\">4</option>  \n");
      out.write("                        <option  value=\"5\">5</option>  \n");
      out.write("                        <option  value=\"6\">6</option>  \n");
      out.write("                        <option  value=\"7\">7</option>  \n");
      out.write("                        <option  value=\"8\">8</option>  \n");
      out.write("                        <option  value=\"9\">9</option>  \n");
      out.write("                        <option  value=\"10\">10</option>  \n");
      out.write("                    </select>  \n");
      out.write("                </label>  \n");
      out.write("            </div> \n");
      out.write("            <hr>\n");
      out.write("            <div class=\"comboBoxRealizacao\">  \n");
      out.write("                <label> \n");
      out.write("                    Como você avaliaria a realização do curso?\n");
      out.write("                    <select name=\"avaliaRealizacao\" size=\"0\">\n");
      out.write("                        <option selected=\"selecaoRealizacao\">Escolha</option>\n");
      out.write("                        <option value=\"0\">0</option>\n");
      out.write("                        <option value=\"1\">1</option>\n");
      out.write("                        <option value=\"2\">2</option>\n");
      out.write("                        <option value=\"3\">3</option>\n");
      out.write("                        <option value=\"4\">4</option>\n");
      out.write("                        <option value=\"5\">5</option>\n");
      out.write("                        <option value=\"6\">6</option>\n");
      out.write("                        <option value=\"7\">7</option>\n");
      out.write("                        <option value=\"8\">8</option>\n");
      out.write("                        <option value=\"9\">9</option>\n");
      out.write("                        <option value=\"10\">10</option>\n");
      out.write("                    </select>\n");
      out.write("                </label>  \n");
      out.write("            </div> \n");
      out.write("            <hr>\n");
      out.write("            <div class=\"comboBoxRealizacao\">  \n");
      out.write("                <label> \n");
      out.write("                    Que nota você daria para o instrutor deste treinamento?\n");
      out.write("                    <select name=\"avaliaRealizacao\" size=\"0\">\n");
      out.write("                        <option selected=\"selecaoRealizacao\">Escolha</option>\n");
      out.write("                        <option value=\"0\">0</option>\n");
      out.write("                        <option value=\"1\">1</option>\n");
      out.write("                        <option value=\"2\">2</option>\n");
      out.write("                        <option value=\"3\">3</option>\n");
      out.write("                        <option value=\"4\">4</option>\n");
      out.write("                        <option value=\"5\">5</option>\n");
      out.write("                        <option value=\"6\">6</option>\n");
      out.write("                        <option value=\"7\">7</option>\n");
      out.write("                        <option value=\"8\">8</option>\n");
      out.write("                        <option value=\"9\">9</option>\n");
      out.write("                        <option value=\"10\">10</option>\n");
      out.write("                    </select>\n");
      out.write("                </label>  \n");
      out.write("            </div> \n");
      out.write("            <hr>\n");
      out.write("            <label>\n");
      out.write("                O conteúdo foi adequado e é aplicável no seu dia-a-dia?\n");
      out.write("                <input type=\"radio\" name=\"radios\" value=\"sim\" checked>\n");
      out.write("                SIM\n");
      out.write("                <input type=\"radio\" name=\"radios\" value=\"nao\">\n");
      out.write("                NÃO\n");
      out.write("            </label>\n");
      out.write("            <hr>\n");
      out.write("            <label>\n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao1\">Posso Aplicar o que aprendi imediatamente no meu dia-a-dia.<BR>\n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao2\">O instrutor dominava o conteudo apresentado.<BR>\n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao3\">Todos ficaram atentos ao curso durante toda a sua duração.<BR>\n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao4\">Poucas pessoas faltaram ou se ausentaram durante o treinamento.<BR>\n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao5\">Gostaria que houvesse outros treinamentos como este<BR> \n");
      out.write("                <input type=\"checkbox\" name=\"id\" value=\"opcao6\">Precisamos de mais aprofundamento no tema apresentado<BR> \n");
      out.write("            </label>\n");
      out.write("            <hr>\n");
      out.write("            <label>\n");
      out.write("                Comentários:\n");
      out.write("                <textarea id=\"comentario\" name=\"comentario\" ></textarea>\n");
      out.write("            </label>\n");
      out.write("            <input type=\"submit\" value=\"Enviar\" name=\"BotaoEnviar\" />\n");
      out.write("\n");
      out.write("            <h2>\n");
      out.write("\n");
      out.write("                ");

                    if (request.getAttribute("NomeCompleto") != null) {
                        out.print(request.getAttribute("NomeCompleto"));
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </h2>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
