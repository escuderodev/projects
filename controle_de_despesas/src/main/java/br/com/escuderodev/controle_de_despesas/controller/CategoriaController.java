package br.com.escuderodev.controle_de_despesas.controller;

import br.com.escuderodev.controle_de_despesas.models.categoria.Categoria;
import br.com.escuderodev.controle_de_despesas.models.categoria.CategoriaRepository;
import br.com.escuderodev.controle_de_despesas.models.categoria.DadosAtualizaCategoria;
import br.com.escuderodev.controle_de_despesas.models.categoria.DadosCadastroCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @GetMapping("/formulario")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var categoria = repository.getReferenceById(id);
            model.addAttribute("categoria", categoria);
        }
        return "categoria/formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("listaDeCategorias", repository.findAll());
        return "categoria/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraCategoria(DadosCadastroCategoria dados) {
        var categoria = new Categoria(dados);
        repository.save(categoria);
        return "redirect:/categoria";
    }

    @PutMapping
    @Transactional
    public String atualizaCategoria(DadosAtualizaCategoria dados) {
        var produto = repository.getReferenceById(dados.idCategoria());
        produto.atualizaDados(dados);
        return "redirect:/categoria";
    }

    @DeleteMapping
    @Transactional
    public String deletaCategoria(Long idCategoria) {
        repository.deleteById(idCategoria);
        return "redirect:/categoria";
    }
}
