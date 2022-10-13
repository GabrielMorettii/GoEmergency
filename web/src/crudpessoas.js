const openmenu = document.querySelector("#openmenu");
const menupopup = document.querySelector("#menupopup");
const editmodal = document.querySelector("#editmodal");
const closebuttonmodal = document.querySelector("#closebuttonmodal");
const closebuttoncreatemodal = document.querySelector("#closebuttoncreatemodal");
const criarbotao = document.querySelector("#criarbotao");
const contenteditmodal = document.querySelector("#contenteditmodal");
const contentcreatemodal = document.querySelector("#contentcreatemodal");

openmenu.addEventListener("click", ()=>{
    menupopup.classList.toggle("inactive");
})

closebuttonmodal.addEventListener("click", ()=>{
    editmodal.classList.toggle("inactive");
    contenteditmodal.classList.toggle("inactive");
})

closebuttoncreatemodal.addEventListener("click", ()=>{
    editmodal.classList.toggle("inactive");
    contentcreatemodal.classList.toggle("inactive");
})

criarbotao.addEventListener("click", ()=>{
    editmodal.classList.toggle("inactive");
    contentcreatemodal.classList.toggle("inactive");
})

function Editar(element){
   editmodal.classList.toggle("inactive");
   contenteditmodal.classList.toggle("inactive");
}

