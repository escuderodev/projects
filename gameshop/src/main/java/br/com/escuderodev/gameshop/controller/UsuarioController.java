package br.com.escuderodev.gameshop.controller;

import br.com.escuderodev.gameshop.models.usuario.DadosAtualizaUsuario;
import br.com.escuderodev.gameshop.models.usuario.DadosCadastroUsuario;
import br.com.escuderodev.gameshop.models.usuario.Usuario;
import br.com.escuderodev.gameshop.models.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @GetMapping("formulario")
    public String loadFormPage(Long id, Model model) {
        if (id != null) {
            var usuario = repository.getReferenceById(id);
            model.addAttribute("usuario", usuario);
        }
        return "usuario/formulario";
    }

    @GetMapping
    public String loadListPage(Model model) {
        model.addAttribute("listaDeUsuarios", repository.findAll());
        return "usuario/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraUsuario(DadosCadastroUsuario dados) {
        var usuario = new Usuario(dados);
        usuario.setSenha(encoder.encode(dados.senha()));
        repository.save(usuario);
        return "redirect:/usuario";
    }

    @PutMapping
    @Transactional
    public String atualizaUsuario(DadosAtualizaUsuario dados) {
        Usuario usuario = repository.getReferenceByUsuario(dados.usuario());
        usuario.atualizaDados(dados);
        usuario.setSenha(encoder.encode(dados.senha()));
        return "redirect:/usuario";
    }

    @DeleteMapping
    @Transactional
    public String deletaUsuario(Long idusuario) {
        repository.deleteById(idusuario);
        return "redirect:/produto";
    }

}
