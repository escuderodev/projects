package br.com.escuderodev.cadastro.DAO;

import br.com.escuderodev.cadastro.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Integer> {
}
