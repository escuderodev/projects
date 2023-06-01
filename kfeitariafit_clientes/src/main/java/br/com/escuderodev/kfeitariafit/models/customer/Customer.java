package br.com.escuderodev.kfeitariafit.models.customer;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    private String nome;
    private String telefone;
    private String endereco;
    private String restricao;

    public Customer(CustomerRegistrationData data) {
        this.idcliente = data.idcliente();
        this.nome = data.nome();
        this.telefone = data.telefone();
        this.endereco = data.endereco();
        this.restricao = data.restricao();
    }

    public Customer() {
    }

    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getRestricao() {
        return restricao;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idcliente=" + idcliente +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", restricao='" + restricao + '\'' +
                '}';
    }

    public void updateData(CustomerUpdateData data) {
        this.nome = data.nome();
        this.telefone = data.telefone();
        this.endereco = data.endereco();
        this.restricao = data.restricao();
    }
}
