package br.com.escuderodev.controle_de_despesas.models.categoria;

import br.com.escuderodev.controle_de_despesas.models.movimentacao.Movimentacao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Categoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;
    @OneToMany
    private List<Movimentacao> movimentacao;

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
