package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.models.Pedido;
import br.com.alura.mvc.mudi.models.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public String home(Model model) {
        List<Pedido> pedidos = repository.findAll();
        model.addAttribute("listaDePedidos", pedidos);
        return "home";
    }
}
