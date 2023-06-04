package br.com.escuderodev.controle_de_pedidos.models;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpedido;
    private String orcamento;
    private BigDecimal valor;
    private String cliente;
    private String telefone;
    private String email;
    private String contato;
    private String entrega;
    private String pagamento;

//    constructor
    public Pedido(DadosCadastroPedido dados) {
        this.idpedido = dados.idpedido();
        this.orcamento = dados.orcamento();
        this.valor = dados.valor();
        this.cliente = dados.cliente();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.contato = dados.contato();
        this.entrega = dados.entrega();
        this.pagamento = dados.pagamento();
    }

    public Pedido() {
    }

//    getters and setters
    public Long getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Long idpedido) {
        this.idpedido = idpedido;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idpedido=" + idpedido +
                ", orcamento='" + orcamento + '\'' +
                ", valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contato='" + contato + '\'' +
                ", entrega=" + entrega +
                ", pagamento=" + pagamento +
                '}';
    }

    public void atualizarDados(DadosAtualizaPedido dados) {
        this.orcamento = dados.orcamento();
        this.valor = dados.valor();
        this.cliente = dados.cliente();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.contato = dados.contato();
        this.entrega = dados.entrega();
        this.pagamento = dados.pagamento();
    }
}
