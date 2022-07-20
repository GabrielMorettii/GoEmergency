const closebutton = document.querySelector("#closebutton");
const modal = document.querySelector("#modalbox");
const tipomensagem = document.querySelector("#tipomensagem");
const mensagem = document.querySelector("#mensagem");
const iconmodal = document.querySelector("#iconmodal");

closebutton.addEventListener("click", () => {
  modal.classList.toggle("inactive");
});

if(tipomensagem.textContent === 'Erro') {
    iconmodal.setAttribute('src', '/GoEmergency/public/assets/warning(1).png');    
    
    modal.classList.remove('inactive');
    modal.classList.add('erro');
}else if(tipomensagem.textContent === 'Sucesso'){
    iconmodal.setAttribute('src', '/GoEmergency/public/assets/check(1).png');  
    
    modal.classList.remove("inactive");
    modal.classList.add('sucesso');
} 