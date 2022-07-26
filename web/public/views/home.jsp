<%-- 
    Document   : home
    Created on : Jul 22, 2022, 10:59:10 AM
    Author     : moretti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/assets/favicon-removebg-preview.png" type="image/x-icon">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/home.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
        <title>GoEmergency</title>
    </head>
    <body>
        <header>
            <ul>
              <a href="${pageContext.request.contextPath}/public/views/home.jsp"><img src="https://templates.hibotheme.com/teli/default/assets/img/logo.png" alt="Logo"></a>
              <div id="positionright">
                <li><a href="${pageContext.request.contextPath}/public/views/home.jsp">Home</a></li>
                <li><a href="#">Contato</a></li>
                <li><a href="#">Dúvidas</a></li>
                <li><a href="#">Sobre</a></li>
                <li><a href="${pageContext.request.contextPath}/public/views/login.jsp"><img src="https://medico24hs.com.br/wp-content/uploads/2022/05/Icone_Usuario_Menu_22.svg">Entrar</a></li>
                <li id="cadastrohome"><a href="${pageContext.request.contextPath}/public/views/paciente/cadastropaciente.jsp" id="linkcadastro" class="whitecolor">Cadastro</a></li>
              </div>
            </ul>
        </header>
        <main>
          <div id="telaprincipal">
            <div id="maincontent" class="whitecolor">
              <p>Consulte agora mesmo</p>
              <h1>Cuide da sua saúde com médicos online 24h</h1>
              <p>Evite filas, salas de espera e custos com deslocamento. Tenha acesso a saúde de qualidade por um preço justo.</p>
              <div id="servicesmain">
                <div class="whitecolor">
                  <img src="${pageContext.request.contextPath}/public/assets/lupa.png" alt="Lupa">
                  <p class="whitecolor">Consulte sintomas</p>
                  <p class="whitecolor">Iniciar busca</p>
                </div>
                <div class="whitecolor">
                  <img src="${pageContext.request.contextPath}/public/assets/agenda.png" alt="Agenda">
                  <p>Agendar teleconsultas</p>
                  <p class="greycolor">Agendar agora</p>
                </div>
                <div class="whitecolor">
                  <img src="${pageContext.request.contextPath}/public/assets/frasco.png" alt="Frasco">
                  <p>Consulte exames</p>
                  <p class="greycolor">Buscar exames</p>
                </div>
              </div>
              <img src="${pageContext.request.contextPath}/public/assets/photo-1589859762194-eaae75c61f64.jpeg" alt="pinturadefundo" id="backgroundprincipal">
              <img id="imgmedico" src="${pageContext.request.contextPath}/public/assets/medico-duvidas2_preview_rev_1.png" alt="Imagem de médico">
            </div>
          </div>
          <div id="especialistas">
            <h2>Agende com médicos especialistas</h2>
            <p>Selecione a especialidade, o profissional e a data/horário mais conveniente
              para realizar sua teleconsulta</p>
            <div id="especialistascards">
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/heart.png" alt="cardiologistaicon">
                <p>Cardiologista</p>
              </div>
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/dermatology.png" alt="demartologistaicon">
                <p>Dermatologista</p>
              </div>
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/saude-mental.png" alt="psiquiatriaicon">
                <p>Psiquiatra</p>
              </div>
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/urology.png" alt="urologistaicon">
                <p>Urologista</p>
              </div>
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/cradle.png" alt="pediatriaicon">
                <p>Pediatra</p>
              </div>
              <div class="especialistacard">
                <img src="${pageContext.request.contextPath}/public/assets/gender.png" alt="ginecologistaicon">
                <p>Ginecologista</p>
              </div>
            </div>
          </div>
          <div class="linhadivisoria"></div>
          <div id="depoimentos">
            <div id="primeirodepoimento" class="depoimento">
              <h3>O que falam
                sobre nós</h3>
              <p class="greycolor">Confira a experiência de nossos pacientes com a teleconsulta</p>
              <a href="#">Consulte agora</a>
            </div>
            <div class="depoimento">
              <img src="${pageContext.request.contextPath}/public/assets/double-quotes.png" alt="quotes">
              <p class="greycolor">Excelente. Meu pai fez um atendimento. Super recomendo!</p>
              <p class="greycolor">Letícia Medina</p>
              <p class="greycolor">Rio de Janeiro - RJ</p>
            </div>
            <div class="depoimento">
              <img src="${pageContext.request.contextPath}/public/assets/double-quotes.png" alt="quotes">
              <p class="greycolor"> O médico que me atendeu é muito bom, super atencioso. Gostei muito de tudo, super recomendo vocês. Virei fã! </p>
              <p class="greycolor">Heliomar Vicente</p>
              <p class="greycolor">Buritis - Rondônia</p>
            </div>
          </div>
          <div class="linhadivisoria"></div>
          <div id="sobre">
            <img src="${pageContext.request.contextPath}/public/assets/Modelo-de-Currículo-para-área-de-Medicina.jpg" alt="ImagemMedicina">
            <div id="textosobre">
              <h5 class="greycolor">Inovando no mercado de telessaúde</h5>
              <h3  class="greycolor">O GoEmergency é um projeto acadêmico-científico</h3>
              <p  class="greycolor">Fundado em 2021, na cidade de Jales, pelos alunos Gabriel Moretti e
                Vinicius Antolin diante das diversidades adversidades causadas pela pandêmia
              do corona-vírus </p>
              <p  class="greycolor">Foi criado com o objetivo de ajudar realização de consultas online, as teleconsultas e
                para fins acadêmicos.</p>
            </div>
          </div>
        </main>
        <footer>
          Copyright @ Gabriel e Vinicius 2022. Todos os direitos reservados.
        </footer>
        <div id="modalbox" class="inactive">
            <div id="contentmodal">
                <img id="iconmodal" src="${pageContext.request.contextPath}/public/assets/check(1).png" alt="IconModal">
                <div id="textmodal">
                    <p><strong id="tipomensagem">${tipomensagem}</strong></p>
                    <p id="mensagem">${mensagem}</p>
                </div>
                <img id="closebutton" src="${pageContext.request.contextPath}/public/assets/close.png" alt="Close">
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/src/script.js"></script>
  </body>
</html>
