package com.caio.lavajato.api.controller;

import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar (){
        return  clienteRepository.listar();
    }

    @GetMapping("{clienteId}")
    public ResponseEntity<Cliente> buscar(@PathVariable("clienteId") Long clienteId) {
        Cliente cliente = clienteRepository.porId(clienteId);
        return ResponseEntity.ok(cliente);
    }
}
