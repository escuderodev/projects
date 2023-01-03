
const botao = document.getElementById('botao');
const resultado = document.getElementById('resultado');
const form = document.getElementById('form');

// carregaDados();
form.addEventListener('submit', function (e) {
    e.preventDefault();

    const salarioDigitado = parseFloat(document.getElementById('salario').value);
    const diasMes = parseInt(document.getElementById('dias_mes').value);
    const mesesAno = parseInt(document.getElementById('meses_ano').value);
    const mesesTrabalhados = parseInt(document.getElementById('total_meses_trabalhados').value);

    let totais = 0;
    let saldoSalario = calculaSaldoSalario(salarioDigitado, diasMes);
    let feriasVencidas = parseFloat(calculaFeriasVencidas(salarioDigitado));
    let feriasProporcionais = parseFloat(calculaFeriasProporcionais(mesesAno, feriasVencidas));
    let decimoTerceiroProporcional = parseFloat(calculaDecimoTerceiroProporcional(salarioDigitado, mesesAno));
    let avisoPrevioIndenizado = parseFloat(calculaAvisoPrevioIndenizado(salarioDigitado));
    let multaRescisoria = parseFloat(calculaMultaRescisoria(salarioDigitado, mesesTrabalhados));
    totais = saldoSalario + feriasVencidas + feriasProporcionais + decimoTerceiroProporcional + avisoPrevioIndenizado + multaRescisoria;

    resultado.innerHTML = `Saldo Salário R$: ${saldoSalario.toFixed(2)} + Férias Vencidas R$: ${feriasVencidas.toFixed(2)} + Férias Proporcionais R$: ${feriasProporcionais.toFixed(2)} + Decimo Terceiro Proporcional R$: ${decimoTerceiroProporcional.toFixed(2)} + Aviso Prévio Indenizado R$: ${avisoPrevioIndenizado.toFixed(2)} + Multa Rescisoria R$: ${multaRescisoria.toFixed(2)} <br><br> <span class="totais">Totais a Receber R$: ${totais.toFixed(2)}</span>`;

});

function calculaSaldoSalario(salario, diasTrabalhados) {
    let saldoSalario = (salario / 30) * diasTrabalhados;
    return saldoSalario;
};

function calculaFeriasVencidas(salario) {
    let tercoSalario = salario / 3;
    let feriasVencidas = salario + tercoSalario;
    return feriasVencidas;
};

function calculaFeriasProporcionais(mesesTrabalhadosNoAno, valorDasFerias) {
    let feriasProporcionais = (valorDasFerias / 12) * mesesTrabalhadosNoAno;
    return feriasProporcionais;
};

function calculaDecimoTerceiroProporcional(salario, mesesTrabalhadosNoAno) {
    let decimoTerceiroProporcional = (salario / 12) * mesesTrabalhadosNoAno;
    return decimoTerceiroProporcional;
};

function calculaAvisoPrevioIndenizado(salario) {
    let salarioPorDia = salario / 30;
    let avisoPrevioIndenizado = salarioPorDia * 33;
    return avisoPrevioIndenizado;
};

function calculaMultaRescisoria(salario, TotalMesesTrabalhados) {
    let depMensalFgts = salario * 0.08;
    let totalContribuicaoFGTS = depMensalFgts * TotalMesesTrabalhados;
    let multaRescisoria = totalContribuicaoFGTS * 0.4;
    return multaRescisoria;
};
