package org.apache.jsp.public_.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/favicon-removebg-preview.png\" type=\"image/x-icon\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/home.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\r\n");
      out.write("        <title>GoEmergency</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <ul>\r\n");
      out.write("              <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img src=\"https://templates.hibotheme.com/teli/default/assets/img/logo.png\" alt=\"Logo\"></a>\r\n");
      out.write("              <div id=\"positionright\">\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">Contato</a></li>\r\n");
      out.write("                <li><a href=\"#\">Dúvidas</a></li>\r\n");
      out.write("                <li><a href=\"#\">Sobre</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/login.jsp\"><img src=\"https://medico24hs.com.br/wp-content/uploads/2022/05/Icone_Usuario_Menu_22.svg\">Entrar</a></li>\r\n");
      out.write("                <li id=\"cadastrohome\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/paciente/cadastropaciente.jsp\" id=\"linkcadastro\" class=\"whitecolor\">Cadastro</a></li>\r\n");
      out.write("              </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main>\r\n");
      out.write("          <div id=\"telaprincipal\">\r\n");
      out.write("            <div id=\"maincontent\" class=\"whitecolor\">\r\n");
      out.write("              <p>Consulte agora mesmo</p>\r\n");
      out.write("              <h1>Cuide da sua saúde com médicos online 24h</h1>\r\n");
      out.write("              <p>Evite filas, salas de espera e custos com deslocamento. Tenha acesso a saúde de qualidade por um preço justo.</p>\r\n");
      out.write("              <div id=\"servicesmain\">\r\n");
      out.write("                <div class=\"whitecolor\">\r\n");
      out.write("                  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/lupa.png\" alt=\"Lupa\">\r\n");
      out.write("                  <p class=\"whitecolor\">Consulte sintomas</p>\r\n");
      out.write("                  <p class=\"whitecolor\">Iniciar busca</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"whitecolor\">\r\n");
      out.write("                  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/agenda.png\" alt=\"Agenda\">\r\n");
      out.write("                  <p>Agendar teleconsultas</p>\r\n");
      out.write("                  <p class=\"greycolor\">Agendar agora</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"whitecolor\">\r\n");
      out.write("                  <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/frasco.png\" alt=\"Frasco\">\r\n");
      out.write("                  <p>Consulte exames</p>\r\n");
      out.write("                  <p class=\"greycolor\">Buscar exames</p>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/photo-1589859762194-eaae75c61f64.jpeg\" alt=\"pinturadefundo\" id=\"backgroundprincipal\">\r\n");
      out.write("              <img id=\"imgmedico\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/medico-duvidas2_preview_rev_1.png\" alt=\"Imagem de médico\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"especialistas\">\r\n");
      out.write("            <h2>Agende com médicos especialistas</h2>\r\n");
      out.write("            <p>Selecione a especialidade, o profissional e a data/horário mais conveniente\r\n");
      out.write("              para realizar sua teleconsulta</p>\r\n");
      out.write("            <div id=\"especialistascards\">\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/heart.png\" alt=\"cardiologistaicon\">\r\n");
      out.write("                <p>Cardiologista</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/dermatology.png\" alt=\"demartologistaicon\">\r\n");
      out.write("                <p>Dermatologista</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/saude-mental.png\" alt=\"psiquiatriaicon\">\r\n");
      out.write("                <p>Psiquiatra</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/urology.png\" alt=\"urologistaicon\">\r\n");
      out.write("                <p>Urologista</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/cradle.png\" alt=\"pediatriaicon\">\r\n");
      out.write("                <p>Pediatra</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"especialistacard\">\r\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/gender.png\" alt=\"ginecologistaicon\">\r\n");
      out.write("                <p>Ginecologista</p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"linhadivisoria\"></div>\r\n");
      out.write("          <div id=\"depoimentos\">\r\n");
      out.write("            <div id=\"primeirodepoimento\" class=\"depoimento\">\r\n");
      out.write("              <h3>O que falam\r\n");
      out.write("                sobre nós</h3>\r\n");
      out.write("              <p class=\"greycolor\">Confira a experiência de nossos pacientes com a teleconsulta</p>\r\n");
      out.write("              <a href=\"#\">Consulte agora</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"depoimento\">\r\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/double-quotes.png\" alt=\"quotes\">\r\n");
      out.write("              <p class=\"greycolor\">Excelente. Meu pai fez um atendimento. Super recomendo!</p>\r\n");
      out.write("              <p class=\"greycolor\">Letícia Medina</p>\r\n");
      out.write("              <p class=\"greycolor\">Rio de Janeiro - RJ</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"depoimento\">\r\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/double-quotes.png\" alt=\"quotes\">\r\n");
      out.write("              <p class=\"greycolor\"> O médico que me atendeu é muito bom, super atencioso. Gostei muito de tudo, super recomendo vocês. Virei fã! </p>\r\n");
      out.write("              <p class=\"greycolor\">Heliomar Vicente</p>\r\n");
      out.write("              <p class=\"greycolor\">Buritis - Rondônia</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"linhadivisoria\"></div>\r\n");
      out.write("          <div id=\"sobre\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Modelo-de-Currículo-para-área-de-Medicina.jpg\" alt=\"ImagemMedicina\">\r\n");
      out.write("            <div id=\"textosobre\">\r\n");
      out.write("              <h5 class=\"greycolor\">Inovando no mercado de telessaúde</h5>\r\n");
      out.write("              <h3  class=\"greycolor\">O GoEmergency é um projeto acadêmico-científico</h3>\r\n");
      out.write("              <p  class=\"greycolor\">Fundado em 2021, na cidade de Jales, pelos alunos Gabriel Moretti e\r\n");
      out.write("                Vinicius Antolin diante das diversidades adversidades causadas pela pandêmia\r\n");
      out.write("              do corona-vírus </p>\r\n");
      out.write("              <p  class=\"greycolor\">Foi criado com o objetivo de ajudar realização de consultas online, as teleconsultas e\r\n");
      out.write("                para fins acadêmicos.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </main>\r\n");
      out.write("        <footer>\r\n");
      out.write("          Copyright @ Gabriel e Vinicius 2022. Todos os direitos reservados.\r\n");
      out.write("        </footer>\r\n");
      out.write("        <div id=\"modalbox\" class=\"inactive\">\r\n");
      out.write("            <div id=\"contentmodal\">\r\n");
      out.write("                <img id=\"iconmodal\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/check(1).png\" alt=\"IconModal\">\r\n");
      out.write("                <div id=\"textmodal\">\r\n");
      out.write("                    <p><strong id=\"tipomensagem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipomensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></p>\r\n");
      out.write("                    <p id=\"mensagem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <img id=\"closebutton\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/close.png\" alt=\"Close\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
