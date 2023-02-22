package br.com.escuderodev.models;

public class DHL implements FreteService {
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.20;
    }
}
