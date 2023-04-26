package br.com.escuderodev.models;

public class ValidaAtendimento {

    public TipoDeAtendimento validaTipoAtendimento(String tipoAtendimento) {
        TipoDeAtendimento tipoDeAtendimento = null;

        if (tipoAtendimento.equalsIgnoreCase("orientacao")) {
            tipoDeAtendimento = TipoDeAtendimento.ORIENTACAO;
        } else if (tipoAtendimento.equalsIgnoreCase("ajuste")) {
            tipoDeAtendimento = TipoDeAtendimento.AJUSTE;
        } else if (tipoAtendimento.equalsIgnoreCase("correcao")) {
            tipoDeAtendimento = TipoDeAtendimento.CORRECAO;
        } else {
            tipoDeAtendimento = null;
        }

        return tipoDeAtendimento;
    }

}
