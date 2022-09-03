<%-- 
    Document   : doencas
    Created on : Sep 3, 2022, 10:09:41 AM
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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/doencas.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comum.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/styles/comumsintomas.css">
        <title>GoEmergency</title>
    </head>
    <body>
        <header>
            <ul>
                <a href="${pageContext.request.contextPath}/public/views/home.jsp"><img src="https://templates.hibotheme.com/teli/default/assets/img/logo.png" alt="Logo"></a>
                <div id="positionright">
                    <li> <a href="${pageContext.request.contextPath}/public/views/home.jsp"><img src="${pageContext.request.contextPath}/public/assets/Symptomate-5.svg" id="voltaricon"/>Voltar</a></li>
                </div>
            </ul>
        </header>
        <main>
            <div id="content">
                <div id="recomendacao">
                    <div id="textrecomendacao">
                        <h5>Consulte um médico</h5>
                        <p>Seus sintomas podem exigir avaliação médica. Agende uma consulta com seu médico. Se os seus sintomas piorarem, consulte um médico imediatamente</p>
                        <div id="tipodeconsulta">
                            <p><strong>Médico recomendado</strong> Clínico Geral </p>
                            <p><strong>Tipo de consulta recomendada </strong> Consulta presencial</p>
                        </div>
                    </div>
                    <div id="imgmedicoiconbackground">
                        <img id="imgmedicoicon" src="${pageContext.request.contextPath}/public/assets/svgexport-3.svg" alt="imgmedicoicon">
                    </div>
                </div>
                <div id="causas">
                    <h6>Possíveis causas</h6>
                    <div id="line"></div>
                    <div id="doencaspossiveis">
                        <div class="doencacard">
                            <p>Resfriado comum</p>
                            <div class="niveldeevidencia">
                                <div class="tipodeevidencia">
                                    <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                                    <span>Evidência moderada</span>
                                </div>
                                <div class="verdetalheasicon">
                                    <span>Ver detalhes</span>
                                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-5.svg" alt="verdetalhesseta">
                                </div>
                            </div>
                        </div>
                        <div class="doencacard">
                            <p>Resfriado comum</p>
                            <div class="niveldeevidencia">
                                <div class="tipodeevidencia">
                                    <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                                    <span>Evidência moderada</span>
                                </div>
                                <div class="verdetalheasicon">
                                    <span>Ver detalhes</span>
                                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-5.svg" alt="verdetalhesseta">
                                </div>
                            </div>
                        </div>
                        <div class="doencacard">
                            <p>Resfriado comum</p>
                            <div class="niveldeevidencia">
                                <div class="tipodeevidencia">
                                    <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                                    <span>Evidência moderada</span>
                                </div>
                                <div class="verdetalheasicon">
                                    <span>Ver detalhes</span>
                                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-5.svg" alt="verdetalhesseta">
                                </div>
                            </div>
                        </div>
                        <div class="doencacard">
                            <p>Resfriado comum</p>
                            <div class="niveldeevidencia">
                                <div class="tipodeevidencia">
                                    <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                                    <span>Evidência moderada</span>
                                </div>
                                <div class="verdetalheasicon">
                                    <span>Ver detalhes</span>
                                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-5.svg" alt="verdetalhesseta">
                                </div>
                            </div>
                        </div>
                        <div class="doencacard">
                            <p>Resfriado comum</p>
                            <div class="niveldeevidencia">
                                <div class="tipodeevidencia">
                                    <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                                    <span>Evidência moderada</span>
                                </div>
                                <div class="verdetalheasicon">
                                    <span>Ver detalhes</span>
                                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-5.svg" alt="verdetalhesseta">
                                </div>
                            </div>
                        </div>
                    </div>
                    <br>
                    <p id="footercausas">A lista de possíveis condições pode não ser completa, é fornecida apenas para fins informativos, não é uma opinião médica qualificada e não pode substituir o diagnóstico médico.</p>
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
        <div id="modaldoenca" class="inactive">
            <div id="doencaativabackground">
                <div id="doencahead">
                    <img src="${pageContext.request.contextPath}/public/assets/svgexport-9.svg" id="closebuttondoenca" alt="closebuttonicon" style="width: 27px">
                    <div id="nomedoenca">
                        <p>Abscesso cerebral</p>
                        <div class="tipodeevidencia">
                            <img src="${pageContext.request.contextPath}/public/assets/carregar (1).png" alt="barradeprogresso">
                            <span>Evidência moderada</span>
                        </div>
                    </div>
                </div>
                <div id="doencadetalhes">
                    <h5>Descrição</h5>
                    <pre>Os abscessos cerebrais são um processo inflamatório infecioso no cérebro. Eles começam como uma inflamação localizada, conhecida como cerebrite. Caso não seja tratada ela evolui com a formação de coleções encapsuladas contendo pus, células inflamatórias e células do tecido cerebral mortas.​ As coleções inflamatórias podem conter um ou múltiplos tipos de microorganismos diferentes como: fungos, bactérias e entre outros.  </pre>
                    <div id="line"></div>
                    <h5>Sintomas</h5>
                    <ul>
                        <li>Dor de cabeça</li>
                        <li>Vômito</li>
                        <li>Papiledema</li>
                        <li>Hérnia cerebral</li>
                        <li>Punção lombar</li>
                    </ul>
                    <div id="line"></div>
                    <h5>Causas</h5>
                    <pre>​​​​​Uma grande variedade de microrganismos pode causar abscessos cerebrais. Os microrganismos mais comuns envolvidos, diferem dependendo do local da infecção primária. Muitas vezes não é possível isolar o microrganismo causador da infecção.

                        As bactérias anaeróbicas são muito comuns nos abscessos cerebrais. Esses microrganismos geralmente originam da flora bacteriana normal da boca e são frequentemente ocasionados a partir de infecções como os abscessos dentários. 

                        As infecções intraabdominais ou pélvicas são mais comuns entre mulheres e também podem estar associadas à disseminação pelo sangue. As bactérias anaeróbicas são as mais frequentes. Nesses casos as bactérias anaeróbicas geralmente refletem a flora do trato genital e urinário ou do intestino grosso (colón). As bactérias anaeróbicas mais frequentes colhidas de culturas de material de abscessos cerebrais incluem: estreptococos anaeróbicos, Bacteroides spp, Prevotella melanogenica, Cutibacterium, Fusobacterium, Eubacterium, Veillonella e Actinomyces.

                        As bactérias aeróbicas Gram positivas também são frequentemente encontrados nos abscessos cerebrais e incluem: Streptococcus Viridans, Streptococcus Milleri, Streptococcus Microaerófilos, Streptococcus Pneumoniae e Staphylococcus Aureus. O Staphylococcus Aureus é um microrganismo frequentemente encontrado nos abcessos cerebrais após traumas de crânio ou um procedimentos neurocirúrgicos. 

                        As bactérias Gram-negativas aeróbicas podem ser isoladas a partir de material dos abscessos cerebrais após neurocirurgias, traumatismos cranianos ou infecções de ouvido. Quando essas bactérias aeróbicas gram-negativas são isoladas as mais frequentes são: Klebsiella pneumoniae, Pseudomonas spp, Escherichia coli e Proteus.

                        Pacientes  imunocomprometidos como por exemplo: pacientes transplantados, pacientes com imunodeficiência associada ao HIV, pacientes que utilizam drogas imunosupressoras como os corticoides, podem apresentar abscessos por uma gama de microrganismos que não são comuns em pacientes imunocompetentes. Esses microrganismos são conhecidos como oportunistas. Os mais comuns são: Toxoplasma gondii, infecções por Listeria monocytogenes particularmente em pacientes em uso de corticoides. Nocardia asteroides, organismo encontrado no solo que pode invadir o cérebro após inalação. 
                        Aspergillus , Cryptococcus neoformans e Coccidioides immitis também podem entrar através dos pulmões e posteriormente invadir o cérebro. </pre>
                    <div id="line"></div>
                    <h5>Diagnóstico</h5>
                    <pre>Devemos utilizar os exames de imagem para o diagnóstico dos abscessos cerebrais como por exemplo: a tomografia computadorizada e a ressonância magnética. A tomografia computadorizada não é tão sensível quanto a ressonância magnética para o diagnóstico de abscesso cerebral, mas a tomografia é mais disponível na maioria dos hospitais. Para o diagnóstico de abscesso cerebral devemos utilizar contraste tanto nos exames de tomografia quanto nos exames de ressonância magnética, pois, a utilização de contraste aumenta a sensibilidade de detecção de ambos os exames. 

                        A punção lombar para coleta de líquor, pode ajudar a demonstrar a inflamação do sistema nervoso central e detectar qual o tipo de microorganismo que causou o abscesso cerebral. No entanto deve se tomar cuidado com a piora do estado  neurológico causado por deslocamento de estruturas do cérebro pela alteração de pressão dentro do cérebro, causada pela retirada do líquor, conhecido como hérnia cerebral, que pode ocorrer em 1,5 a 30 % dos casos de abscesso cerebral.

                        Os exames de cultura do sangue (hemocultura) também podem ser utilizados para isolar os microrganismos que causam abscessos cerebrais.

                        Ecocardiograma para endocardites, exames de imagem do tórax para fistulas arteriovenosas pulmonares, exames de imagem do abdomem para infecções pévicas ou abdominais.</pre>
                    <div id="line"></div>
                    <h5>Tratamento</h5>
                    <pre>O tratamento bem sucedido de um abscesso cerebral geralmente requer uma combinação de antibióticos e drenagem cirúrgica. O neurocirurgião precisa ser acionado no momento inicial do diagnóstico. A aspiração ou drenagem cirúrgica pode ser necessária para o diagnóstico e para o tratamento. 

                        Recomendamos a terapia antimicrobiana empírica para todos os pacientes com abscesso cerebral até o isolamento do agente causal. O isolamento dos agentes causais pode ser feitopor  drenaagem cirúrgica, cultura do sangue, cultura do líquor ou de cultura materiais extraídos de outros locais do corpo. 

                        Quando o (s) agente (s) causais são identificados pela cultura, recomendamos que os regimes de tratamento com antibiótico sejam simplificados e direcionados para esse (s) agente (s). Recomendamos o tratamento com antibióticos por pelo menos quatro a oito semanas, orientado pela evolução clínica e  por estudos de imagem seriados.

                        Sugerimos o uso de corticoide  quando ocorre grande inchaço cerebral e alteração importante do estado de consciência. A mortalidade por abscesso cerebral varia de 0 a 30 %. As convulsões são as principais sequelas neurológicas, ocorrendo em 30 a 60 % dos pacientes. O que leva a necessidade do uso de drogas anticonvulsivantes.
                    </pre>
                    <div id="line"></div>
                    <h5>Prevenção</h5>
                    <pre>A prevenção dos abscessos cerebrais depende da prevenção e tratamento precoce de infecções primárias que levam aos abscesso cerebrais como por exemplo: as sinusites, otites, mastoidites, abscesso dentários, endocardites e etc. 

                        Essa prevenção depende também da identificação de pacientes com alto risco de desenvolver abscessos cerebrais como por exemplo: os pacientes imunocomprometidos, os pacientes com doenças cardíacas cianóticas da infância, pacientes com fístulas arteriovenosas pulmonares. Esses pacientes devem utilizar medidas profiláticas que minimizem o risco sempre que necessário. Ou realizar cirurgias que corrijam os defeitos que levam aos abscessos cerebrais como as cardiopatias congênitas ou fístulas arteriovenosas.</pre>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/src/script.js"></script>
        <script src="${pageContext.request.contextPath}/src/doencas.js"></script>
    </body>
</html>