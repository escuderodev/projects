package br.com.escuderodev.gameshop.models.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(DadosCadastroUsuario dados) {
        this.idusuario = dados.idusuario();
        this.nome = dados.nome();
        this.usuario = dados.usuario();
        this.senha = dados.senha();
    }

    public Usuario() {
    }

    public void atualizaDados(DadosAtualizaUsuario dados) {
        this.idusuario = dados.idusuario();
        this.nome = dados.nome();
        this.usuario = dados.usuario();
        this.senha = dados.senha();
    }
}
