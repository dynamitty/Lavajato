package com.caio.lavajato.api.controller;

import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.domain.Veiculo;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import com.caio.lavajato.infrastructure.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listar (){
        return  veiculoRepository.todos();
    }
}
