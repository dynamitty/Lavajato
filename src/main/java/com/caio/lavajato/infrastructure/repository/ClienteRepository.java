package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Cliente;

import java.util.List;

public interface ClienteRepository {

    List<Cliente> listar();
    Cliente porId(Long id);
    Cliente adicionar(Cliente cliente);
    void remover(Cliente cliente);

}
