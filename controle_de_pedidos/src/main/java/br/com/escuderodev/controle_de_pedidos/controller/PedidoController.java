package br.com.escuderodev.controle_de_pedidos.controller;

import br.com.escuderodev.controle_de_pedidos.models.DadosAtualizaPedido;
import br.com.escuderodev.controle_de_pedidos.models.DadosCadastroPedido;
import br.com.escuderodev.controle_de_pedidos.models.Pedido;
import br.com.escuderodev.controle_de_pedidos.models.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("/formulario")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var pedido = repository.getReferenceById(id);
            model.addAttribute("pedido", pedido);
        }
        return "formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("listaDePedidos", repository.findAll());
        return "listagem";
    }

    @PostMapping
    @Transactional
    public String cadastrarPedido(DadosCadastroPedido dados) {
        var pedido = new Pedido(dados);
        repository.save(pedido);

        return "redirect:/";
    }

    @PutMapping
    @Transactional
    public String atualizarPedido(DadosAtualizaPedido dados) {
        var pedido = repository.getReferenceById(dados.idpedido());
        pedido.atualizarDados(dados);

        return "redirect:/";
    }

    @DeleteMapping
    @Transactional
    public String removerPedido(Long idpedido) {
        repository.deleteById(idpedido);

        return "redirect:/";
    }
}
