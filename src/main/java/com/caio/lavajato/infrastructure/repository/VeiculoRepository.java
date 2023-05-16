package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.domain.Veiculo;

import java.util.List;

public interface VeiculoRepository {

    List<Veiculo> todos();
    Veiculo porCliente(Cliente cliente);
    Veiculo adicionar(Veiculo veiculo);
    void remover(Veiculo veiculo);

}
