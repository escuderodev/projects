package br.com.escuderodev.models;

public class Correios implements FreteService {
    @Override
    public double calculaFrete(double peso) {

        return peso * 0.30;
    }
}
