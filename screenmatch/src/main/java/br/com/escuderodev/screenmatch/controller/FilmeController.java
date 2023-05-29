package br.com.escuderodev.screenmatch.controller;

import br.com.escuderodev.screenmatch.models.filme.DadosCadastroFilme;
import br.com.escuderodev.screenmatch.models.filme.Filme;
import br.com.escuderodev.screenmatch.models.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping("/cadastro")
    public String carregaPaginaCadastroDeFilmes() {
        return "filmes/form_cadastro";
    }

    @GetMapping
    public String carregaPaginaListagemDeFilmes(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastrarFilme(DadosCadastroFilme dados) {
        var filme = new Filme(dados);
        repository.save(filme);
        return "redirect:/filmes";
    }
}
