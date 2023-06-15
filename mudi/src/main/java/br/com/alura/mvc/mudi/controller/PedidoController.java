package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.models.DadosCadastroPedido;
import br.com.alura.mvc.mudi.models.Pedido;
import br.com.alura.mvc.mudi.models.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("formulario")
    public String loadFormPage(DadosCadastroPedido dados) {

        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novoPedido(@Valid DadosCadastroPedido dados, BindingResult result) {
        if (result.hasErrors()) {
            return "pedido/formulario";
        }
        var pedido = new Pedido(dados);
        repository.save(pedido);
        return "redirect:http://localhost:8080/";
    }

}
