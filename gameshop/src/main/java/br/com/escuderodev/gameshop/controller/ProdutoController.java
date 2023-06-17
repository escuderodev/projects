package br.com.escuderodev.gameshop.controller;

import br.com.escuderodev.gameshop.models.produto.DadosAtualizaProduto;
import br.com.escuderodev.gameshop.models.produto.DadosCadastroProduto;
import br.com.escuderodev.gameshop.models.produto.Produto;
import br.com.escuderodev.gameshop.models.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("formulario")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var produto = repository.getReferenceById(id);
            model.addAttribute("produto", produto);
        }
        return "produto/formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("listaDeProdutos", repository.findAll());
        return "produto/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraProduto(DadosCadastroProduto dados) {
        var produto = new Produto(dados);
        repository.save(produto);
        return "redirect:/produto";
    }

    @PutMapping
    @Transactional
    public String atualizaProduto(DadosAtualizaProduto dados) {
        var produto = repository.getReferenceById(dados.idproduto());
        produto.atualizaDados(dados);
        return "redirect:/produto";
    }

    @DeleteMapping
    @Transactional
    public String deletaProduto(Long idproduto) {
        repository.deleteById(idproduto);
        return "redirect:/produto";
    }
}
