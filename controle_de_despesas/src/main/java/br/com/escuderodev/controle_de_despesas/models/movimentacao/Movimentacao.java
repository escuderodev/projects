package br.com.escuderodev.controle_de_despesas.models.movimentacao;

import br.com.escuderodev.controle_de_despesas.models.categoria.Categoria;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
public class Movimentacao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal valor;
    @Enumerated
    private TipoMovimentacao tipo;

    public Movimentacao(DadosCadastroMovimentacao dados) {
        this.id = dados.id();
        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.tipo = dados.tipo();
    }

    public Movimentacao() {
    }

    public void atualizaDados(DadosAtualizaMovimentacao dados) {
        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.tipo = dados.tipo();
    }
}
