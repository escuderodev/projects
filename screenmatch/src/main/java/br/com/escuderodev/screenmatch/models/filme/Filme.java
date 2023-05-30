package br.com.escuderodev.screenmatch.models.filme;

import jakarta.persistence.*;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfilme;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoDeLancamento;
    private String genero;


    public Filme(DadosCadastroFilme dados) {
        this.idfilme = dados.idfilme();
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Filme() {

    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setIdfilme(Long idfilme) {
        this.idfilme = idfilme;
    }

    public Long getIdfilme() {
        return idfilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void atualizaDados(DadosAlteracaoFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
    }
}
