package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Procedimento;

import java.util.List;

public interface ProcedimentoRepository {

    List<Procedimento> listar();
    Procedimento porId(Long id);
    Procedimento adicionar(Procedimento procedimento);
    void remover(Procedimento procedimento);

}
