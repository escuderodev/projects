package br.com.escuderodev.screenmatch.models.filme;

public class Filme {

    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoDeLancamento;
    private String genero;

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoDeLancamento = dados.ano();
        this.genero = dados.genero();
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

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoDeLancamento=" + anoDeLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
