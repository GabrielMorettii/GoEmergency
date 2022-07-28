<%-- 
    Document   : resetarsenha
    Created on : Jul 13, 2022, 9:38:25 AM
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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/resetarsenha.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
        <title>GoEmergency</title>
    </head>
    <body>
        <img id="background" src="${pageContext.request.contextPath}/public/assets/Reset password-bro.png" alt="Resetar a senha imagem">
        <div id="content">
            <h1>Criar nova senha</h1>
            <div id="divescudo">
                <img id="escudo" src="${pageContext.request.contextPath}/public/assets/encrypted(1).png" alt="Escudo">
            </div>
            <p>Sua nova senha tem que ser diferente da anterior</p>
            <form action="${pageContext.request.contextPath}/ResetarSenha" method="POST">
                <input type="hidden" name="email" value="${email}">
                
                <label for="">Nova senha</label>
                <input type="password" name="novasenha" placeholder="**********" id="passwordinput" required>

                <label for="">Confirmar senha</label>
                <input type="password" name="confirmacao" placeholder="**********" id="passwordinput" required>

                <button type="submit">Salvar</button>
            </form>
            <p>Já lembrou ? <a id="voltarlogin" href="${pageContext.request.contextPath}/public/views/login.jsp">Volte para logar</a></p>
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
