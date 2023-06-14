package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.models.Pedido;
import br.com.alura.mvc.mudi.models.PedidoRepository;
import br.com.alura.mvc.mudi.models.StatusPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{status}")
    public String findByStatus(@PathVariable("status") String status, Model model) {
        List<Pedido> pedidos = repository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
        model.addAttribute("listaDePedidos", pedidos);
        model.addAttribute("status", status);
        return "home";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError() {
        return "redirect:/";
    }
}
