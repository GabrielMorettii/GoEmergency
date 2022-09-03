const closebuttondoenca = document.querySelector("#closebuttondoenca");
const modaldoenca = document.querySelector("#modaldoenca");
const pagina = document.querySelector("html");
const doencacards = document.querySelectorAll(".doencacard");

closebuttondoenca.addEventListener("click", ()=>{
    modaldoenca.classList.add("inactive")
    pagina.classList.remove("overflowhidden")
})

for(const card of doencacards){
    card.addEventListener("click", ()=>{
        modaldoenca.classList.remove("inactive")
        pagina.classList.add("overflowhidden")
    })
}