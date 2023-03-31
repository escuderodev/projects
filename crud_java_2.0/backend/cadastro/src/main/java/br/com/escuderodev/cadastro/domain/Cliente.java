package br.com.escuderodev.cadastro.domain;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idcliente;
    @Column(name = "nome", length = 100, nullable = true)
    private String nome;
    @Column(name = "telefone", length = 12, nullable = true)
    private String telefone;
    @Column(name = "logradouro", length = 100, nullable = true)
    private String logradouro;
    @Column(name = "numero", length = 10, nullable = true)
    private String numero;
    @Column(name = "complemento", length = 20, nullable = false)
    private String complemento;
    @Column(name = "cidade", length = 100, nullable = true)
    private String cidade;
    @Column(name = "estado", length = 2, nullable = true)
    private String estado;
    @Column(name = "cep", length = 8, nullable = true)
    private String cep;

    //    getters and setters
    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
