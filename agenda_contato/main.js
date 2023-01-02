// capturando elementos do DOM
const form = document.getElementById('form_contato');
const contacts = [];
const phones = [];

// armazernando todas as linhas digitadas em um array glogal
let lines = [];

form.addEventListener('submit', function(evento) {
    // deabilitando reload da página
    evento.preventDefault();

    // funções auxiliares
    addLine();
    updateTable();
});

// função que adiciona uma linha a tabela
function addLine() {
    // recuperando os valores dos inputs
    const inputName = document.getElementById('nome');
    const inputTel = document.getElementById('telefone');

    // validando duplicidade de registros
    if(contacts.includes(inputName.value)) {
        alert(`O contato ${inputName.value} já foi cadastrado!`);
    } else {
        // guardando os inputs em arrays
        contacts.push(inputName.value);
        phones.push(inputTel.value);

        // preparando a inserção de dados na tabela
        let line = '<tr>';
        line += `<td>${inputName.value}</td>`;
        line += `<td>${inputTel.value}</td>`;
        lines += line;
    };

    // limpando os campos após o submit
    inputName.value = '';
    inputTel.value = ''; 
};

// função que atualiza a tabela
function updateTable() {
    // recuperando o corpo da tabela
    const tbody = document.querySelector('tbody');
    // inserindo as linhas na tabela
    tbody.innerHTML = lines;
};