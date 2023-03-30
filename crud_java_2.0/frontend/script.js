const form = document.querySelector(".form");
const Inome = document.getElementById("nome");
const Itelefone = document.getElementById("telefone");
const Ilogradouro = document.getElementById("logradouro");
const Inumero = document.getElementById("numero");
const Icomplemento = document.getElementById("complemento");
const Icidade = document.getElementById("cidade");
const Iestado = document.getElementById("estado");
const Icep = document.getElementById("cep");

function cadastrarCliente() {
    fetch("http://localhost:8080/cliente"),
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: 'POST',
        body: JSON.stringify({
            nome: Inome.value,
            telefone: Itelefone.value,
            logradouro: Ilogradouro.value,
            numero: Inumero.value,
            complemento: Icomplemento.value,
            cidade: Icidade.value,
            estado: Iestado.value,
            cep: Icep.value
        })
    }
    .then((res) => console.log(res))
    .catch((res) => console.log(res))
}

function limparCampos() {
    Inome.value = "";
    Itelefone.value = "";
    Ilogradouro.value = "";
    Inumero.value = "";
    Icomplemento.value = "";
    Icidade.value = "";
    Iestado.value = "";
    Icep.value = "";
}

form.addEventListener('submit', (event) => {
    event.preventDefault();

    cadastrarCliente();
    limparCampos();
});