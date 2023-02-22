package br.com.escuderodev.models;

public class Produto {
    private String nome;
    private double peso;

//    constructor
    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    //    getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
