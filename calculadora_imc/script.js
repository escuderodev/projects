
window.onload = () => {
    let button = document.querySelector("#btn_calcular");
        // Função para calcular IMC
        button.addEventListener("click", calculaIMC);
    };

function calculaIMC() {
    // capturando o peso
    let peso = parseFloat(document.querySelector('.peso').value);
    // capturando a altura
    let altura = parseFloat((document.querySelector('.altura').value/100));
    
    // calculando o IMC
    let imc = (peso / Math.pow(altura, 2)).toFixed(2);
    // capturando o campo que exibirá o resultado
    let resultado = document.querySelector('#resultado');

    // classificando imc
    if(imc < 18.5) {
        resultado.innerHTML =
            `Seu IMC é<span>${imc}</span>e você está abaixo do peso.`;
    } else if(imc >= 18.5 && imc < 25) {
        resultado.innerHTML =
            `Seu IMC é<span>${imc}</span>e você está no peso normal.`;
    } else if(imc >= 25 && imc < 30) {
        resultado.innerHTML =
            `Seu IMC é<span>${imc}</span>e você está acima do peso.`;
    } else if(imc >= 30 && imc < 40) {
        resultado.innerHTML =
            `Seu IMC é<span>${imc}</span>e você está Obeso.`;
    } else {
        resultado.innerHTML =
            `Seu IMC é<span>${imc}</span>e você está com Obesidade Morbida.`;
    }
}