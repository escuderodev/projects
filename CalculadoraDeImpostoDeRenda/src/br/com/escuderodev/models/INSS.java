package br.com.escuderodev.models;

import java.text.DecimalFormat;

public class INSS {

    public String calculaAlicota(double salario) {
        String salarioFormatado = new DecimalFormat("0.00").format(salario);

        if (salario < 1302.01) {
            return "Seu salário é R$ " + salarioFormatado + " e você é isento";
        } else if (salario <= 2571.29) {
            return "Seu salário é R$ " + salarioFormatado + " e sua alicota é 9%";
        } else if (salario <= 3856.94) {
            return "Seu salário é R$ " + salarioFormatado + " e sua alicota é 12%";
        } else {
            return "Seu salário é R$ " + salarioFormatado + " e sua alicota é 14%";
        }
    }
}
