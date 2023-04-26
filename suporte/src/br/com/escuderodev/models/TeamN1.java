package br.com.escuderodev.models;

public class TeamN1 extends Team {
    public TeamN1(Team nextTeam) {
        super(nextTeam);
    }

    @Override
    public String rotearChamado(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento) {
        if (atendimento.getTipoDeAtendimento().equals(TipoDeAtendimento.ORIENTACAO.getClassificacaoAtendimento())) {
            return "Chamado atendido pelo Time N1 via Orientação ao usuário.";
        }
        return nextTeam.rotearChamado(atendimento, tipoDeAtendimento);
    }
}
