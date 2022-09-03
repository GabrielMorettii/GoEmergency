package org.apache.jsp.public_.views.paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastropaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/favicon-removebg-preview.png\" type=\"image/x-icon\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/cadastro.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\r\n");
      out.write("        <title>GoEmergency</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div id=\"background\">\r\n");
      out.write("                <img id=\"imagebackground\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Hospital bed-pana.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"signup\">\r\n");
      out.write("                <h2>Cadastrar</h2>\r\n");
      out.write("                <h6>Saiba mais informações!</h6>\r\n");
      out.write("                <p id=\"description\">Cadastra-se para poder consultar sintomas e obter ajuda.</p>\r\n");
      out.write("                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarPessoa\" method=\"POST\" id=\"formsignup\">\r\n");
      out.write("                    <h3>Informações Pessoais</h3>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"personalinformation\">\r\n");
      out.write("                        <div class=\"personalinformationinput\">\r\n");
      out.write("                            <label for=\"nome\">Nome</label>\r\n");
      out.write("                            <input type=\"text\" id=\"nome\" name=\"nome\" placeholder=\"Digite seu nome\" maxlength=\"50\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"personalinformationinput\">\r\n");
      out.write("                            <label for=\"email\">Email</label>\r\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Digite seu email\" maxlength=\"50\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"personalinformationinput\">\r\n");
      out.write("                            <label for=\"cpf\">CPF</label>\r\n");
      out.write("                            <input type=\"text\" id=\"cpf\"  name=\"cpf\" placeholder=\"Digite seu CPF\" maxlength=\"14\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"personalinformationinput\">\r\n");
      out.write("                            <label for=\"nascimento\">Data de nascimento</label>\r\n");
      out.write("                            <input type=\"date\" placeholder=\"dd-mm-yyyy\" id=\"nascimento\" name=\"nascimento\" required> \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <label for=\"telefone\">Telefone</label>\r\n");
      out.write("                            <input type=\"tel\" id=\"telefone\" name=\"telefone\" placeholder=\"(17) 99532-4221\" maxlength=\"15\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"personalinformationinput\">\r\n");
      out.write("                            <label for=\"senha\">Senha</label>\r\n");
      out.write("                            <input type=\"password\" id=\"senha\" name=\"senha\" placeholder=\"Digite seu Senha\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <h3>Endereço</h3>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"address\">\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"cep\">CEP</label>\r\n");
      out.write("                            <input type=\"text\" id=\"cep\" name=\"cep\" placeholder=\"CEP\" maxlength=\"8\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"bairro\">Bairro</label>\r\n");
      out.write("                            <input type=\"text\" id=\"bairro\" name=\"bairro\" placeholder=\"Bairro\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"rua\">Rua</label>\r\n");
      out.write("                            <input type=\"text\" id=\"rua\" name=\"rua\" placeholder=\"Rua\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"numero\">Número</label>\r\n");
      out.write("                            <input type=\"text\" id=\"numero\" name=\"numero\" placeholder=\"Número\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"cidade\">Cidade</label>\r\n");
      out.write("                            <input type=\"text\" id=\"cidade\" name=\"cidade\" placeholder=\"Cidade\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"addressinformation\">\r\n");
      out.write("                            <label for=\"estado\">Estado</label>\r\n");
      out.write("                            <input type=\"text\" id=\"estado\" name=\"estado\" placeholder=\"Estado\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <input id=\"submitbuttonform\" type=\"submit\" value=\"Criar conta\">\r\n");
      out.write("\r\n");
      out.write("                    <p>Você é médico?<a id=\"logarconta\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/medico/cadastromedico.jsp\"> Cadastre aqui</a></p>\r\n");
      out.write("                    <p>Já tem um conta? <a id=\"logarconta\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/login.jsp\">Logue aqui</a></p>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
      out.write("/src/mascaras.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/apicep.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
