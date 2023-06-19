package br.com.escuderodev.controle_de_despesas.models.movimentacao;

import java.math.BigDecimal;

public record DadosAtualizaMovimentacao(Long idMovimentacao, String descricao, BigDecimal valor, TipoMovimentacao tipo) {
}
