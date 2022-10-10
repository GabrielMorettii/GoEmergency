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

      out.write("\r\n");
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
      out.write("/public/styles/sintomas.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comumsintomas.css\">\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.2/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://unpkg.com/darkreader@4.9.44/darkreader.js\" async></script>\r\n");
      out.write("        <title>GoEmergency</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img id=\"logo\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/logo.png\" alt=\"Logo\"></a>\r\n");
      out.write("                <div id=\"positionright\">\r\n");
      out.write("                    <li> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-5.svg\" id=\"voltaricon\"/>Voltar</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main>\r\n");
      out.write("            <form action=\"#\">\r\n");
      out.write("                <div id=\"pesquisararea\">\r\n");
      out.write("                    <div id=\"upperformsintoma\">\r\n");
      out.write("                        <div id=\"textpesquisar\">\r\n");
      out.write("                                <h3>Adicione seus sintomas</h3>\r\n");
      out.write("                                <p>Adicione o máximo de sintomas possível para obter resultados mais precisos.</p>\r\n");
      out.write("                                <select id=\"sintomas\">\r\n");
      out.write("                                    <option disabled value=\"\" selected hidden>Pesquisar, por exemplo: dor de cabeça</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <ul id=\"sintomaspesquisados\"></ul>\r\n");
      out.write("                         </div>\r\n");
      out.write("                        <div id=\"modeloanatomico\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div id=\"girarbotao\">\r\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-4.svg\" alt=\"giraricon\">\r\n");
      out.write("                        Girar modelo\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"submitform\">\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/termodeadesao.jsp\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/Symptomate-5.svg\" id=\"voltaricon\"/>Voltar</a>\r\n");
      out.write("                    <input type=\"submit\" id=\"pesquisardoenca\" value=\"Pesquisar\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </main>\r\n");
      out.write("        <footer>\r\n");
      out.write("            Copyright @ Gabriel e Vinicius 2022. Todos os direitos reservados.\r\n");
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
      out.write("        </div>  \r\n");
      out.write("        <div id=\"popupsintoma\">\r\n");
      out.write("            <div id=\"headerpopup\">\r\n");
      out.write("                <span id=\"titulopartesdocorpo\"></span>\r\n");
      out.write("                <img id=\"fecharpopup\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/closepopup.svg\" alt=\"Close\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul id=\"listadesintomasespecifico\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("         </div>\r\n");
      out.write("             <div id=\"load\">\r\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/loading-gif.gif\" alt=\"gifloading\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"togglediv\">\r\n");
      out.write("            <input type=\"checkbox\" class=\"checkbox\" id=\"chk\" />\r\n");
      out.write("            <label class=\"label\" for=\"chk\">\r\n");
      out.write("                    <i class=\"fas fa-moon\"></i>\r\n");
      out.write("                    <i class=\"fas fa-sun\"></i>\r\n");
      out.write("                    <div class=\"ball\"></div>\r\n");
      out.write("            </label>\r\n");
      out.write("        </div>   \r\n");
      out.write("         <script type='text/javascript'>\r\n");
      out.write("            var listadesintomas = JSON.parse(`");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listadesintomas}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("`);\r\n");
      out.write("         </script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/sintomas.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
