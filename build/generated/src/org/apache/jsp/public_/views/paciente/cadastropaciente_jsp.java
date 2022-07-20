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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/favicon-removebg-preview.png\" type=\"image/x-icon\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/cadastro.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\n");
      out.write("        <title>GoEmergency</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"background\">\n");
      out.write("                <img id=\"imagebackground\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Hospital bed-pana.png\">\n");
      out.write("            </div>\n");
      out.write("            <div id=\"signup\">\n");
      out.write("                <h2>Cadastrar</h2>\n");
      out.write("                <h6>Saiba mais informações!</h6>\n");
      out.write("                <p id=\"description\">Cadastra-se para poder consultar sintomas e obter ajuda.</p>\n");
      out.write("                <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SalvarPessoa\" method=\"POST\" id=\"formsignup\">\n");
      out.write("                    <h3>Informações Pessoais</h3>\n");
      out.write("\n");
      out.write("                    <div id=\"personalinformation\">\n");
      out.write("                        <div class=\"personalinformationinput\">\n");
      out.write("                            <label for=\"nome\">Nome</label>\n");
      out.write("                            <input type=\"text\" id=\"nome\" name=\"nome\" placeholder=\"Digite seu nome\" maxlength=\"50\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"personalinformationinput\">\n");
      out.write("                            <label for=\"email\">Email</label>\n");
      out.write("                            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Digite seu email\" maxlength=\"50\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"personalinformationinput\">\n");
      out.write("                            <label for=\"cpf\">CPF</label>\n");
      out.write("                            <input type=\"text\" id=\"cpf\"  name=\"cpf\" placeholder=\"Digite seu CPF\" maxlength=\"11\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"personalinformationinput\">\n");
      out.write("                            <label for=\"nascimento\">Data de nascimento</label>\n");
      out.write("                            <input type=\"date\" id=\"nascimento\" name=\"nascimento\" required> \n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <label for=\"telefone\">Telefone</label>\n");
      out.write("                            <input type=\"tel\" id=\"telefone\" name=\"telefone\" placeholder=\"(17) 99532-4221\" maxlength=\"11\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"personalinformationinput\">\n");
      out.write("                            <label for=\"senha\">Senha</label>\n");
      out.write("                            <input type=\"password\" id=\"senha\" name=\"senha\" placeholder=\"Digite seu Senha\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <h3>Endereço</h3>\n");
      out.write("\n");
      out.write("                    <div id=\"address\">\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"cep\">CEP</label>\n");
      out.write("                            <input type=\"text\" id=\"cep\" name=\"cep\" placeholder=\"CEP\" maxlength=\"8\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"bairro\">Bairro</label>\n");
      out.write("                            <input type=\"text\" id=\"bairro\" name=\"bairro\" placeholder=\"Bairro\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"rua\">Rua</label>\n");
      out.write("                            <input type=\"text\" id=\"rua\" name=\"rua\" placeholder=\"Rua\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"numero\">Número</label>\n");
      out.write("                            <input type=\"text\" id=\"numero\" name=\"numero\" placeholder=\"Número\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"cidade\">Cidade</label>\n");
      out.write("                            <input type=\"text\" id=\"cidade\" name=\"cidade\" placeholder=\"Cidade\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"addressinformation\">\n");
      out.write("                            <label for=\"estado\">Estado</label>\n");
      out.write("                            <input type=\"text\" id=\"estado\" name=\"estado\" placeholder=\"Estado\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input id=\"submitbuttonform\" type=\"submit\" value=\"Criar conta\">\n");
      out.write("\n");
      out.write("                    <p>Você é médico?<a id=\"logarconta\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/medico/cadastromedico.jsp\"> Cadastre aqui</a></p>\n");
      out.write("                    <p>Já tem um conta? <a id=\"logarconta\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/login.jsp\">Logue aqui</a></p>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"modalbox\" class=\"inactive\">\n");
      out.write("            <div id=\"contentmodal\">\n");
      out.write("                <img id=\"iconmodal\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/check(1).png\" alt=\"IconModal\">\n");
      out.write("                <div id=\"textmodal\">\n");
      out.write("                    <p><strong id=\"tipomensagem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipomensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></p>\n");
      out.write("                    <p id=\"mensagem\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensagem}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <img id=\"closebutton\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/close.png\" alt=\"Close\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/apicep.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\n");
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
