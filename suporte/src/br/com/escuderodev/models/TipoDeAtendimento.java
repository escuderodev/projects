package br.com.escuderodev.models;

public enum TipoDeAtendimento {

    ORIENTACAO("ORIENTACAO"),
    AJUSTE("AJUSTE"),
    CORRECAO("CORRECAO");

    private String classificacaoAtendimento;

    TipoDeAtendimento(String classificacaoAtendimento) {
        this.classificacaoAtendimento = classificacaoAtendimento;
    }

    public String getClassificacaoAtendimento() {
        return classificacaoAtendimento;
    }
}
