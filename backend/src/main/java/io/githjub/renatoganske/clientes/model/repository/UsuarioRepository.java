package io.githjub.renatoganske.clientes.model.repository;

import io.githjub.renatoganske.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
