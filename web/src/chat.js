const chatmedicosespecialistas = document.querySelector("#chatmedicosespecialistas");


listademedicos.forEach(medico =>
 chatmedicosespecialistas.innerHTML += `
  <div class="cardmedico">
    <img src='https://ui-avatars.com/api/?background=0D8ABC&color=fff&bold=true&size=128&name=${medico.nome}' alt="avatar"/>
    <div class="profilemedico">
        <p>${medico.nome}</p>
        <p>${medico.especialidade}</p>
    </div>
   </div>
`);