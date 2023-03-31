package br.com.escuderodev.cadastro.DAO;

import br.com.escuderodev.cadastro.domain.DadosCadastroCliente;

import java.sql.Connection;

public class ClienteDAO {

    private Connection conn;

    public ClienteDAO(Connection connection) {
        this.conn = connection;
    }

    public void gravarDados(DadosCadastroCliente dados) {

    }
}
