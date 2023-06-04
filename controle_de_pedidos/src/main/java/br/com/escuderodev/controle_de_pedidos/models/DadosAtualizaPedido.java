package br.com.escuderodev.controle_de_pedidos.models;

import java.math.BigDecimal;
import java.util.Date;

public record DadosAtualizaPedido(Long idpedido, String orcamento, BigDecimal valor, String cliente, String telefone, String email, String contato, String entrega, String pagamento) {
}
