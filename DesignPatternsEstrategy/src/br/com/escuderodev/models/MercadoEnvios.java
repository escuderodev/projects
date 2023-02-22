package br.com.escuderodev.models;

public class MercadoEnvios implements FreteService {
    @Override
    public double calculaFrete(double peso) {
        return peso * 0.10;
    }
}
