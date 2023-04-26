package br.com.escuderodev.models;

public class TeamDev extends Team {

    public TeamDev(Team nextTeam) {
        super(nextTeam);
    }

    @Override
    public String rotearChamado(Atendimento atendimento, TipoDeAtendimento tipoDeAtendimento) {
        if (atendimento.getTipoDeAtendimento().equals(TipoDeAtendimento.CORRECAO.getClassificacaoAtendimento())) {
            return "Chamado atendido pelo Time Dev via Defect com Atualização do sistema.";
        }
        return nextTeam.rotearChamado(atendimento, tipoDeAtendimento);
    }
}
