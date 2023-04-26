package br.com.escuderodev.models;

public class Teste {

    public static void main(String[] args) {
        String tipo = "ajuste";

        TipoDeAtendimento tipoDeAtendimento = TipoDeAtendimento.AJUSTE;

        System.out.println(tipo.toUpperCase().equals(tipoDeAtendimento.getClassificacaoAtendimento()));
    }
}
