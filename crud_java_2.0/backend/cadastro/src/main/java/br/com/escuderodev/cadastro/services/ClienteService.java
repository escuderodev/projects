package br.com.escuderodev.cadastro.services;

import br.com.escuderodev.cadastro.DAO.ClienteDAO;
import br.com.escuderodev.cadastro.database.ConnectionFactory;
import br.com.escuderodev.cadastro.domain.Cliente;
import br.com.escuderodev.cadastro.domain.DadosCadastroCliente;

import java.sql.Connection;
import java.util.HashSet;
import java.util.Set;

public class ClienteService {

    private ConnectionFactory connection;

    public ClienteService() {
        this.connection = new ConnectionFactory();
    }

    private Set<Cliente> clientes = new HashSet<>();

    public Set<Cliente> listarClientes() {
        return clientes;
    }

    public void cadastrarCliente(DadosCadastroCliente dados) {
        Connection conn = connection.connectToBD();
        new ClienteDAO(conn).gravarDados(dados);
    }
}
