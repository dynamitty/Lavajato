package com.caio.lavajato.jpa;

import com.caio.lavajato.LavajatoApplication;
import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


public class InclusoaClienteMain {

    public static void main(String[]args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(LavajatoApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ClienteRepository clienteRepository = applicationContext.getBean(ClienteRepository.class);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Felipe");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Claudia");

        cliente1 = clienteRepository.adicionar(cliente1);
        cliente2 = clienteRepository.adicionar(cliente2);

        System.out.printf("%d - %s\n", cliente1.getId(),cliente1.getNome());
        System.out.printf("%d - %s\n", cliente2.getId(),cliente2.getNome());



    }


    }

