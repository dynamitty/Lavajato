package com.caio.lavajato.api.controller;

import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.domain.Procedimento;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import com.caio.lavajato.infrastructure.repository.ProcedimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/procedimentos")
public class ProcedimentoController {
    @Autowired
    private ProcedimentoRepository procedimentoRepository;

    @GetMapping
    public List<Procedimento> listar (){
        return  procedimentoRepository.listar();
    }
}
