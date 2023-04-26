package br.com.escuderodev.models;

public class TeamN2 extends Team {

    public TeamN2(Team nextTeam) {
        super(nextTeam);
    }

    @Override
    public String rotearChamado(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento) {
        if (atendimento.getTipoDeAtendimento().equals(TipoDeAtendimento.AJUSTE.getClassificacaoAtendimento())) {
            return "Chamado atendido pelo Time N2 via Ajuste Pontual em banco de Dados.";
        }
        return nextTeam.rotearChamado(atendimento, tipoDeAtendimento);
    }
}
