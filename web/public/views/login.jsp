<%-- 
    Document   : login
    Created on : Jul 13, 2022, 9:37:41 AM
    Author     : moretti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>GoEmergency</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/assets/favicon-removebg-preview.png" type="image/x-icon">
        <link href="${pageContext.request.contextPath}/public/styles/login.css" rel="stylesheet">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
    </head>
    <body>
         <div id="content">
            <div id="background">
                <img id="imagebackground" src="${pageContext.request.contextPath}/public/assets/Health professional team-amico.png"
                     alt="Imagem de Médico">
            </div>
            <div id="login">
                <div id="iconelogin">
                  <img id="icone" src="https://img.freepik.com/vetores-gratis/forma-medica-do-coracao-e-design-de-logotipo-medico_23987-717.jpg?w=2000" alt="Imagem de Médico">
                </div>
                <div id="textologin">
                    <h2>Bem vindo de volta!</h2>
                    <h6>Aqui nos presamos pelo melhor atendimento no conforto de sua casa</h6>
                </div>
                <form action="${pageContext.request.contextPath}/LogarPessoa" method="POST" id="formlogin">
                    <div id="logininputs">
                        <div>
                        <label class="form-label" for="email">Email</label>
                        <input type="email" name="email" id="Email" class="form-control" placeholder="Digite seu email" required maxlength="50"/>
                        </div>

                        <div>
                           <label class="form-label" for="senha">Senha</label>
                           <input type="password" name="senha" id="Senha" class="form-control" placeholder="Digite sua senha" required />
                       </div>
                    </div>

                    <a id="lembrarsenha" href="${pageContext.request.contextPath}/public/views/esqueceusenha.jsp">Esqueceu a senha?</a>
    
                    <input id="buttonsubmit" type="submit" value="Entrar" >
                </form>
                
                <p id="linkcadastrar" >Ainda não tem uma conta? <a href="${pageContext.request.contextPath}/public/views/paciente/cadastropaciente.jsp">Cadastre-se</a></p>
            </div>
        </div>
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
