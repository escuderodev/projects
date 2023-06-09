package br.com.escuderodev.vendas.models;

import java.math.BigDecimal;

public record AtualizaDadosPedido(
        Long idpedido,
        String cliente,
        String trabalho,
        String orcamento,
        String calculo,
        BigDecimal valor,
        BigDecimal percentual,
        BigDecimal comissao,
        String dataEnvioNF,
        String dataVencimentoBoleto,
        int prazoPagamento,
        String numeroOP) {
}
