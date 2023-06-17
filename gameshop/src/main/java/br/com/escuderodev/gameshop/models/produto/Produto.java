package br.com.escuderodev.gameshop.models.produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idproduto;
    private String nomeProduto;
    private BigDecimal valor;

    public Produto(DadosCadastroProduto dados) {
        this.idproduto = dados.idproduto();
        this.nomeProduto = dados.nomeProduto();
        this.valor = dados.valor();
    }

    public Produto() {
    }

    public void atualizaDados(DadosAtualizaProduto dados) {
        this.idproduto = dados.idproduto();
        this.nomeProduto = dados.nomeProduto();
        this.valor = dados.valor();
    }
}
