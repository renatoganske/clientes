package io.githjub.renatoganske.clientes.model.repository;

import io.githjub.renatoganske.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByUsername(String username);

    /* existsByUsername é um query method que faz o seguinte:
     select count(*) > 0 from usuario where username = :login */
    boolean existsByUsername(String username);
}
