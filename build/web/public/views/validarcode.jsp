<%-- 
    Document   : validarcode
    Created on : Jul 13, 2022, 9:38:30 AM
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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/validarcode.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
        <title>GoEmergency</title>
    </head>
    <body>
        <img id="background" src="${pageContext.request.contextPath}/public/assets/Enter OTP-bro.png" alt="Validar codigo imagem">
        <div id="content">
            <h1>Verifique seu código</h1>
            <div id="divemail">
                <img id="emailicon" src="${pageContext.request.contextPath}/public/assets/email.png" alt="Email">
            </div>
            <p>Por favor digite o código de 5 dígitos que foi enviado para o seu email</p>
            <form id="formcode" action="${pageContext.request.contextPath}/ValidarCode" method="POST">
                <input type="hidden" name="email" value="${email}">
                <div id="codeinputdiv">
                    <input type="text" name="digito1" class="codeinput" maxlength="1">
                    <input type="text" name="digito2" class="codeinput" maxlength="1">
                    <input type="text" name="digito3" class="codeinput" maxlength="1">
                    <input type="text" name="digito4" class="codeinput" maxlength="1">
                    <input type="text" name="digito5" class="codeinput" maxlength="1">
                </div>
                <button type="submit">Verificar</button>
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
