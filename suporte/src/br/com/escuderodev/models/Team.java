package br.com.escuderodev.models;

public abstract class Team {
    protected Team nextTeam;

    public Team(Team nextTeam) {

        this.nextTeam = nextTeam;
    }

    public abstract String rotearChamado(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento);
}
