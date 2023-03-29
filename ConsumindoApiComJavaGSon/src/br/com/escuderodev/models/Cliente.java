package br.com.escuderodev.models;

import java.sql.Timestamp;

public class Cliente {

    private Integer codigo;
    private String nome;
    private String email;
    private Timestamp dtNascimento;

//    getters and setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Timestamp dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dtNascimento=" + dtNascimento +
                '}';
    }

}
