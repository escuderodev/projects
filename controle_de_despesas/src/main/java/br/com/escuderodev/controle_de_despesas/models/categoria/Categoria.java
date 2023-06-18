package br.com.escuderodev.controle_de_despesas.models.categoria;

import br.com.escuderodev.controle_de_despesas.models.movimentacao.DadosAtualizaMovimentacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;

    public Categoria(DadosCadastroCategoria dados) {
        this.id = dados.id();
        this.categoria = dados.categoria();
    }

    public Categoria() {
    }

    public void atualizaDados(DadosAtualizaCategoria dados) {
        this.categoria = dados.categoria();
    }
}
