package br.com.escuderodev.screenmatch.controller;

import br.com.escuderodev.screenmatch.models.filme.DadosCadastroFilme;
import br.com.escuderodev.screenmatch.models.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping("/cadastro")
    public String carregaPaginaCadastroDeFilmes() {
        return "filmes/form_cadastro";
    }

    @PostMapping
    public String cadastrarFilme(DadosCadastroFilme dados) {
        var filme = new Filme(dados);
        filmes.add(filme);
        return "redirect:/filmes";
    }

    @GetMapping
    public String carregaPaginaListagemDeFilmes(Model model) {
        model.addAttribute("lista", filmes);
        return "filmes/listagem";
    }
}