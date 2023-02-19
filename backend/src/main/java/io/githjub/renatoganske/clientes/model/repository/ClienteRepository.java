package io.githjub.renatoganske.clientes.model.repository;

import io.githjub.renatoganske.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
