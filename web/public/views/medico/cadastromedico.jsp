<%-- 
    Document   : cadastromedico
    Created on : Jul 13, 2022, 9:33:43 AM
    Author     : moretti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/public/assets/favicon-removebg-preview.png" type="image/x-icon">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/cadastro.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
        <title>GoEmergency</title>
    </head>
    <body>
        <div id="content">
            <div id="background">
                <img id="imagebackground" src="${pageContext.request.contextPath}/public/assets/Cardiologist-amico.png">
            </div>
            <div id="signup">
                <h2>Cadastrar</h2>
                <h6>Saiba mais informações!</h6>
                <p id="description">Cadastra-se para poder consultar pacientes e obter ajuda.</p>
                <form action="${pageContext.request.contextPath}/SalvarMedico" method="POST" id="formsignup">
                    <h3>Informações Pessoais</h3>

                    <div id="personalinformation">
                        <div class="personalinformationinput">
                            <label for="nome">Nome</label>
                            <input type="text" id="nome" name="nome" placeholder="Digite seu nome" maxlength="50" required>
                        </div>
                        <div class="personalinformationinput">
                            <label for="email">Email</label>
                            <input type="email" id="email" name="email" placeholder="Digite seu email" maxlength="50" required>
                        </div>
                        <div class="personalinformationinput">
                            <label for="cpf">CPF</label>
                            <input type="text" id="cpf"  name="cpf" placeholder="Digite seu CPF" maxlength="14" required>
                        </div>
                        <div class="personalinformationinput">
                            <label for="nascimento">Data de nascimento</label>
                            <input type="date" id="nascimento" name="nascimento" required> 
                        </div>
                        <div>
                            <label for="telefone">Telefone</label>
                            <input type="tel" id="telefone" name="telefone" placeholder="(17) 99532-4221" maxlength="15" required>
                        </div>
                        <div class="personalinformationinput">
                            <label for="senha">Senha</label>
                            <input type="password" id="senha" name="senha" placeholder="Digite seu Senha" required>
                        </div>
                        <div class="personalinformationinput">
                            <label for="UFCRM">UF CRM</label>
                            <select id="UFCRM" name="ufcrm" required>
                            </select>
                        </div>
                        <div class="personalinformationinput">
                            <label for="CRM">CRM</label>
                            <input type="text" id="CRM" name="crm" placeholder="CRM" maxlength="11" required>
                        </div>
                    </div>

                    <h3>Endereço</h3>

                    <div id="address">
                        <div class="addressinformation">
                            <label for="cep">CEP</label>
                            <input type="text" id="cep" name="cep" placeholder="CEP" maxlength="8" required>
                        </div>
                        <div class="addressinformation">
                            <label for="bairro">Bairro</label>
                            <input type="text" id="bairro" name="bairro" placeholder="Bairro" required>
                        </div>
                        <div class="addressinformation">
                            <label for="rua">Rua</label>
                            <input type="text" id="rua" name="rua" placeholder="Rua" required>
                        </div>
                        <div class="addressinformation">
                            <label for="numero">Número</label>
                            <input type="text" id="numero" name="numero" placeholder="Número" required>
                        </div>
                        <div class="addressinformation">
                            <label for="cidade">Cidade</label>
                            <input type="text" id="cidade" name="cidade" placeholder="Cidade" required>
                        </div>
                        <div class="addressinformation">
                            <label for="estado">Estado</label>
                            <input type="text" id="estado" name="estado" placeholder="Estado" required>
                        </div>
                    </div>

                    <input id="submitbuttonform" type="submit" value="Criar conta">

                    <p>Já tem um conta? <a id="logarconta" href="${pageContext.request.contextPath}/public/views/login.jsp">Logue aqui</a></p>

                </form>
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
        <script src="${pageContext.request.contextPath}/src/mascaras.js"></script>
        <script src="${pageContext.request.contextPath}/src/apicep.js"></script>
        <script src="${pageContext.request.contextPath}/src/script.js"></script>
        <script src="${pageContext.request.contextPath}/src/medico.js"></script>
    </body>
</html>
