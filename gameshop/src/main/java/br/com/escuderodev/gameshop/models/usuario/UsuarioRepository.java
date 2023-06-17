package br.com.escuderodev.gameshop.models.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario getReferenceByUsuario(String usuario);
}
