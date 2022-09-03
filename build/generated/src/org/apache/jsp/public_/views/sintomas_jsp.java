package org.apache.jsp.public_.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sintomas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/public/styles/sintomas.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comumsintomas.css\">\n");
      out.write("        <title>GoEmergency</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <ul>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img src=\"https://templates.hibotheme.com/teli/default/assets/img/logo.png\" alt=\"Logo\"></a>\n");
      out.write("                <div id=\"positionright\">\n");
      out.write("                    <li> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-5.svg\" id=\"voltaricon\"/>Voltar</a></li>\n");
      out.write("                </div>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <form action=\"#\">\n");
      out.write("                <div id=\"pesquisararea\">\n");
      out.write("                    <div id=\"textpesquisar\">\n");
      out.write("                        <h3>Adicione seus sintomas</h3>\n");
      out.write("                        <p>Adicione o máximo de sintomas possível para obter resultados mais precisos.</p>\n");
      out.write("                        <select id=\"sintomas\">\n");
      out.write("                            <option disabled value=\"\" selected hidden>Pesquisar, por exemplo: dor de cabeça</option>\n");
      out.write("                            <option value=\"Dor de cabeça\">Ateste</option>\n");
      out.write("                            <option value=\"Cólica\">Beste</option>\n");
      out.write("                            <option value=\"Nausea\">Cteste</option>\n");
      out.write("                            <option value=\"dordecabeça4\">Dteste</option>\n");
      out.write("                            <option value=\"dordecabeça5\">Eteste</option>\n");
      out.write("                            <option value=\"dordecabeça6\">Fteste</option>\n");
      out.write("                            <option value=\"dordecabeça7\">Gteste</option>\n");
      out.write("                        </select>\n");
      out.write("                        <ul id=\"sintomaspesquisados\"></ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"modeloanatomico\">\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"girarbotao\">\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-4.svg\" alt=\"giraricon\">\n");
      out.write("                        Girar modelo\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"submitform\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/termodeadesao.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-5.svg\" id=\"voltaricon\"/>Voltar</a>\n");
      out.write("                    <input type=\"submit\" id=\"pesquisardoenca\" value=\"Pesquisar\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            Copyright @ Gabriel e Vinicius 2022. Todos os direitos reservados.\n");
      out.write("        </footer>\n");
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
      out.write("        </div>  \n");
      out.write("        <div id=\"popupsintoma\">\n");
      out.write("            <div id=\"headerpopup\">\n");
      out.write("                <span>Cabeça</span>\n");
      out.write("                <img id=\"fecharpopup\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/closepopup.svg\" alt=\"Close\">\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"listadesintomasespecifico\">\n");
      out.write("                <li class=\"sintomadalista\">Dor no membro inferior</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor forte no membro inferior</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor na coxa</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor em ambos os membros inferiores</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor no quadril</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor no quadril</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor no quadril</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor no quadril</li>\n");
      out.write("                <li class=\"sintomadalista\">Dor no quadril</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/sintomas.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
