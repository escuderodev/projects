package br.com.escuderodev.models;

public class RoteadorDeChamado {

    public String rotear(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento) {
        Team team = new TeamN1(new TeamN2(new TeamDev(new TeamClient())));

        return team.rotearChamado(atendimento, tipoDeAtendimento);
    }
}
