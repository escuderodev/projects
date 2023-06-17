package br.com.escuderodev.gameshop.models.produto;

import java.math.BigDecimal;

public record DadosCadastroProduto(Long idproduto, String nomeProduto, BigDecimal valor) {
}
