package br.com.alura.mvc.mudi.models;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPedido(

        @NotBlank
        String nomeProduto,
        @NotBlank
        String urlProduto,
        @NotBlank
        String urlImagem,
        String descricao
    ) {
}
