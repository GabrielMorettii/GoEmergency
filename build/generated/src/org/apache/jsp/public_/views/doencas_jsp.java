package org.apache.jsp.public_.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doencas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/public/styles/doencas.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comum.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/styles/comumsintomas.css\">\r\n");
      out.write("        <title>GoEmergency</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/views/home.jsp\"><img src=\"https://templates.hibotheme.com/teli/default/assets/img/logo.png\" alt=\"Logo\"></a>\r\n");
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
      out.write("            <div id=\"content\">\r\n");
      out.write("                <div id=\"recomendacao\">\r\n");
      out.write("                    <div id=\"textrecomendacao\">\r\n");
      out.write("                        <h5>Consulte um médico</h5>\r\n");
      out.write("                        <p>Seus sintomas podem exigir avaliação médica. Agende uma consulta com seu médico. Se os seus sintomas piorarem, consulte um médico imediatamente</p>\r\n");
      out.write("                        <div id=\"tipodeconsulta\">\r\n");
      out.write("                            <p><strong>Médico recomendado</strong> Clínico Geral </p>\r\n");
      out.write("                            <p><strong>Tipo de consulta recomendada </strong> Consulta presencial</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"imgmedicoiconbackground\">\r\n");
      out.write("                        <img id=\"imgmedicoicon\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-3.svg\" alt=\"imgmedicoicon\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"causas\">\r\n");
      out.write("                    <h6>Possíveis causas</h6>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <div id=\"doencaspossiveis\">\r\n");
      out.write("                        <div class=\"doencacard\">\r\n");
      out.write("                            <p>Resfriado comum</p>\r\n");
      out.write("                            <div class=\"niveldeevidencia\">\r\n");
      out.write("                                <div class=\"tipodeevidencia\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                                    <span>Evidência moderada</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"verdetalheasicon\">\r\n");
      out.write("                                    <span>Ver detalhes</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-5.svg\" alt=\"verdetalhesseta\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"doencacard\">\r\n");
      out.write("                            <p>Resfriado comum</p>\r\n");
      out.write("                            <div class=\"niveldeevidencia\">\r\n");
      out.write("                                <div class=\"tipodeevidencia\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                                    <span>Evidência moderada</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"verdetalheasicon\">\r\n");
      out.write("                                    <span>Ver detalhes</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-5.svg\" alt=\"verdetalhesseta\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"doencacard\">\r\n");
      out.write("                            <p>Resfriado comum</p>\r\n");
      out.write("                            <div class=\"niveldeevidencia\">\r\n");
      out.write("                                <div class=\"tipodeevidencia\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                                    <span>Evidência moderada</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"verdetalheasicon\">\r\n");
      out.write("                                    <span>Ver detalhes</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-5.svg\" alt=\"verdetalhesseta\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"doencacard\">\r\n");
      out.write("                            <p>Resfriado comum</p>\r\n");
      out.write("                            <div class=\"niveldeevidencia\">\r\n");
      out.write("                                <div class=\"tipodeevidencia\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                                    <span>Evidência moderada</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"verdetalheasicon\">\r\n");
      out.write("                                    <span>Ver detalhes</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-5.svg\" alt=\"verdetalhesseta\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"doencacard\">\r\n");
      out.write("                            <p>Resfriado comum</p>\r\n");
      out.write("                            <div class=\"niveldeevidencia\">\r\n");
      out.write("                                <div class=\"tipodeevidencia\">\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                                    <span>Evidência moderada</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"verdetalheasicon\">\r\n");
      out.write("                                    <span>Ver detalhes</span>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-5.svg\" alt=\"verdetalhesseta\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <p id=\"footercausas\">A lista de possíveis condições pode não ser completa, é fornecida apenas para fins informativos, não é uma opinião médica qualificada e não pode substituir o diagnóstico médico.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
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
      out.write("        <div id=\"modaldoenca\" class=\"inactive\">\r\n");
      out.write("            <div id=\"doencaativabackground\">\r\n");
      out.write("                <div id=\"doencahead\">\r\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/svgexport-9.svg\" id=\"closebuttondoenca\" alt=\"closebuttonicon\" style=\"width: 27px\">\r\n");
      out.write("                    <div id=\"nomedoenca\">\r\n");
      out.write("                        <p>Abscesso cerebral</p>\r\n");
      out.write("                        <div class=\"tipodeevidencia\">\r\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/public/assets/carregar (1).png\" alt=\"barradeprogresso\">\r\n");
      out.write("                            <span>Evidência moderada</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"doencadetalhes\">\r\n");
      out.write("                    <h5>Descrição</h5>\r\n");
      out.write("                    <pre>Os abscessos cerebrais são um processo inflamatório infecioso no cérebro. Eles começam como uma inflamação localizada, conhecida como cerebrite. Caso não seja tratada ela evolui com a formação de coleções encapsuladas contendo pus, células inflamatórias e células do tecido cerebral mortas.​ As coleções inflamatórias podem conter um ou múltiplos tipos de microorganismos diferentes como: fungos, bactérias e entre outros.  </pre>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <h5>Sintomas</h5>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li>Dor de cabeça</li>\r\n");
      out.write("                        <li>Vômito</li>\r\n");
      out.write("                        <li>Papiledema</li>\r\n");
      out.write("                        <li>Hérnia cerebral</li>\r\n");
      out.write("                        <li>Punção lombar</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <h5>Causas</h5>\r\n");
      out.write("                    <pre>​​​​​Uma grande variedade de microrganismos pode causar abscessos cerebrais. Os microrganismos mais comuns envolvidos, diferem dependendo do local da infecção primária. Muitas vezes não é possível isolar o microrganismo causador da infecção.\r\n");
      out.write("\r\n");
      out.write("                        As bactérias anaeróbicas são muito comuns nos abscessos cerebrais. Esses microrganismos geralmente originam da flora bacteriana normal da boca e são frequentemente ocasionados a partir de infecções como os abscessos dentários. \r\n");
      out.write("\r\n");
      out.write("                        As infecções intraabdominais ou pélvicas são mais comuns entre mulheres e também podem estar associadas à disseminação pelo sangue. As bactérias anaeróbicas são as mais frequentes. Nesses casos as bactérias anaeróbicas geralmente refletem a flora do trato genital e urinário ou do intestino grosso (colón). As bactérias anaeróbicas mais frequentes colhidas de culturas de material de abscessos cerebrais incluem: estreptococos anaeróbicos, Bacteroides spp, Prevotella melanogenica, Cutibacterium, Fusobacterium, Eubacterium, Veillonella e Actinomyces.\r\n");
      out.write("\r\n");
      out.write("                        As bactérias aeróbicas Gram positivas também são frequentemente encontrados nos abscessos cerebrais e incluem: Streptococcus Viridans, Streptococcus Milleri, Streptococcus Microaerófilos, Streptococcus Pneumoniae e Staphylococcus Aureus. O Staphylococcus Aureus é um microrganismo frequentemente encontrado nos abcessos cerebrais após traumas de crânio ou um procedimentos neurocirúrgicos. \r\n");
      out.write("\r\n");
      out.write("                        As bactérias Gram-negativas aeróbicas podem ser isoladas a partir de material dos abscessos cerebrais após neurocirurgias, traumatismos cranianos ou infecções de ouvido. Quando essas bactérias aeróbicas gram-negativas são isoladas as mais frequentes são: Klebsiella pneumoniae, Pseudomonas spp, Escherichia coli e Proteus.\r\n");
      out.write("\r\n");
      out.write("                        Pacientes  imunocomprometidos como por exemplo: pacientes transplantados, pacientes com imunodeficiência associada ao HIV, pacientes que utilizam drogas imunosupressoras como os corticoides, podem apresentar abscessos por uma gama de microrganismos que não são comuns em pacientes imunocompetentes. Esses microrganismos são conhecidos como oportunistas. Os mais comuns são: Toxoplasma gondii, infecções por Listeria monocytogenes particularmente em pacientes em uso de corticoides. Nocardia asteroides, organismo encontrado no solo que pode invadir o cérebro após inalação. \r\n");
      out.write("                        Aspergillus , Cryptococcus neoformans e Coccidioides immitis também podem entrar através dos pulmões e posteriormente invadir o cérebro. </pre>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <h5>Diagnóstico</h5>\r\n");
      out.write("                    <pre>Devemos utilizar os exames de imagem para o diagnóstico dos abscessos cerebrais como por exemplo: a tomografia computadorizada e a ressonância magnética. A tomografia computadorizada não é tão sensível quanto a ressonância magnética para o diagnóstico de abscesso cerebral, mas a tomografia é mais disponível na maioria dos hospitais. Para o diagnóstico de abscesso cerebral devemos utilizar contraste tanto nos exames de tomografia quanto nos exames de ressonância magnética, pois, a utilização de contraste aumenta a sensibilidade de detecção de ambos os exames. \r\n");
      out.write("\r\n");
      out.write("                        A punção lombar para coleta de líquor, pode ajudar a demonstrar a inflamação do sistema nervoso central e detectar qual o tipo de microorganismo que causou o abscesso cerebral. No entanto deve se tomar cuidado com a piora do estado  neurológico causado por deslocamento de estruturas do cérebro pela alteração de pressão dentro do cérebro, causada pela retirada do líquor, conhecido como hérnia cerebral, que pode ocorrer em 1,5 a 30 % dos casos de abscesso cerebral.\r\n");
      out.write("\r\n");
      out.write("                        Os exames de cultura do sangue (hemocultura) também podem ser utilizados para isolar os microrganismos que causam abscessos cerebrais.\r\n");
      out.write("\r\n");
      out.write("                        Ecocardiograma para endocardites, exames de imagem do tórax para fistulas arteriovenosas pulmonares, exames de imagem do abdomem para infecções pévicas ou abdominais.</pre>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <h5>Tratamento</h5>\r\n");
      out.write("                    <pre>O tratamento bem sucedido de um abscesso cerebral geralmente requer uma combinação de antibióticos e drenagem cirúrgica. O neurocirurgião precisa ser acionado no momento inicial do diagnóstico. A aspiração ou drenagem cirúrgica pode ser necessária para o diagnóstico e para o tratamento. \r\n");
      out.write("\r\n");
      out.write("                        Recomendamos a terapia antimicrobiana empírica para todos os pacientes com abscesso cerebral até o isolamento do agente causal. O isolamento dos agentes causais pode ser feitopor  drenaagem cirúrgica, cultura do sangue, cultura do líquor ou de cultura materiais extraídos de outros locais do corpo. \r\n");
      out.write("\r\n");
      out.write("                        Quando o (s) agente (s) causais são identificados pela cultura, recomendamos que os regimes de tratamento com antibiótico sejam simplificados e direcionados para esse (s) agente (s). Recomendamos o tratamento com antibióticos por pelo menos quatro a oito semanas, orientado pela evolução clínica e  por estudos de imagem seriados.\r\n");
      out.write("\r\n");
      out.write("                        Sugerimos o uso de corticoide  quando ocorre grande inchaço cerebral e alteração importante do estado de consciência. A mortalidade por abscesso cerebral varia de 0 a 30 %. As convulsões são as principais sequelas neurológicas, ocorrendo em 30 a 60 % dos pacientes. O que leva a necessidade do uso de drogas anticonvulsivantes.\r\n");
      out.write("                    </pre>\r\n");
      out.write("                    <div id=\"line\"></div>\r\n");
      out.write("                    <h5>Prevenção</h5>\r\n");
      out.write("                    <pre>A prevenção dos abscessos cerebrais depende da prevenção e tratamento precoce de infecções primárias que levam aos abscesso cerebrais como por exemplo: as sinusites, otites, mastoidites, abscesso dentários, endocardites e etc. \r\n");
      out.write("\r\n");
      out.write("                        Essa prevenção depende também da identificação de pacientes com alto risco de desenvolver abscessos cerebrais como por exemplo: os pacientes imunocomprometidos, os pacientes com doenças cardíacas cianóticas da infância, pacientes com fístulas arteriovenosas pulmonares. Esses pacientes devem utilizar medidas profiláticas que minimizem o risco sempre que necessário. Ou realizar cirurgias que corrijam os defeitos que levam aos abscessos cerebrais como as cardiopatias congênitas ou fístulas arteriovenosas.</pre>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/script.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/src/doencas.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
