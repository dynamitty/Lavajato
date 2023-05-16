package com.caio.lavajato.jpa;

import com.caio.lavajato.LavajatoApplication;
import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


public class AlteracaoClienteMain {

    public static void main(String[]args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(LavajatoApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ClienteRepository clienteRepository = applicationContext.getBean(ClienteRepository.class);

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Felipe");

        clienteRepository.adicionar(cliente);





    }


    }

