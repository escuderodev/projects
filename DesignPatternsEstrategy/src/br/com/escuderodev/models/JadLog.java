package br.com.escuderodev.models;

public class JadLog implements FreteService {
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.22;
    }
}
