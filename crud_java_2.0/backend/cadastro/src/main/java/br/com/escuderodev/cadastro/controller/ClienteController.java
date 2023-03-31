package br.com.escuderodev.cadastro;

import br.com.escuderodev.cadastro.DAO.IClienteDAO;
import br.com.escuderodev.cadastro.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private IClienteDAO dao;

    @GetMapping
    public List<Cliente> clientes() {
        return (List<Cliente>) dao.findAll();
    }

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        Cliente newCliente = dao.save(cliente);
        return newCliente;
    }

    @PutMapping
    public Cliente atualizarCliente(@RequestBody Cliente cliente) {
        Cliente updateCliente = dao.save(cliente);
        return updateCliente;
    }

    @DeleteMapping("/{idcliente")
    public Optional<Cliente> excluirCliente(@PathVariable Integer idcliente) {
        Optional<Cliente> cliente = dao.findById(idcliente);
        dao.deleteById(idcliente);
        return cliente;
    }
}
