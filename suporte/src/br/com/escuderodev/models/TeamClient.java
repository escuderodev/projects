package br.com.escuderodev.models;

public class TeamClient extends Team {
    public TeamClient() {
        super(null);
    }

    @Override
    public String rotearChamado(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento) {

        return "Chamado devolvido ao Suporte do Cliente.";
    }
}
