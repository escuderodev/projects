package br.com.escuderodev.vendas.controller;

import br.com.escuderodev.vendas.models.AtualizaDadosPedido;
import br.com.escuderodev.vendas.models.DadosCadastroPedido;
import br.com.escuderodev.vendas.models.Pedido;
import br.com.escuderodev.vendas.models.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("formulario")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var pedido = repository.getReferenceById(id);
            model.addAttribute("pedido", pedido);
        }
        return "pedido/formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("listaDePedidos", repository.findAll());
        return "pedido/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraPedido(DadosCadastroPedido dados) {
        var pedido = new Pedido(dados);
        repository.save(pedido);

        return "redirect:/pedidos";
    }

    @PutMapping
    @Transactional
    public String atualizaDadosPedido(AtualizaDadosPedido dados) {
        var pedido = repository.getReferenceById(dados.idpedido());
        pedido.atualizaDados(dados);

        return "redirect:/pedidos";
    }

    @DeleteMapping
    @Transactional
    public String deletaPedido(Long idpedido) {
        repository.deleteById(idpedido);

        return"redirect:/pedidos";
    }

}
