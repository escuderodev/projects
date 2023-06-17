package br.com.escuderodev.gameshop.models.produto;

import java.math.BigDecimal;

public record DadosAtualizaProduto(Long idproduto, String nomeProduto, BigDecimal valor) {
}
