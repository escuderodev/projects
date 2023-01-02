// função para mostrar os valores das teclas
function insert(num) {
    let numero = document.getElementById('resultado').innerHTML; //guardar num em número
    document.getElementById('resultado').innerHTML = numero + num; //carregar o valor de numero + num
}

// função para limpar o display
function clean() {
    document.getElementById('resultado').innerHTML = ""
}

// função para apagar o último número digitado
function back() {
    let resultado = document.getElementById('resultado').innerHTML;
    document.getElementById('resultado').innerHTML = resultado.substring(0, resultado.length -1) //pega todos os elementos guardados em resultado e diminiu 1 (último)
}

// função para calcular
function calcular() {
    let resultado = document.getElementById('resultado').innerHTML;
    if(resultado) {
        document.getElementById('resultado').innerHTML = eval(resultado);
    } else {
        document.getElementById('resultado').innerHTML = "";
    }
}