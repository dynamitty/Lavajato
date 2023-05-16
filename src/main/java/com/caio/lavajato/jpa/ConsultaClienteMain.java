package com.caio.lavajato.jpa;

import com.caio.lavajato.LavajatoApplication;
import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaClienteMain {

    public static void main(String[]args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(LavajatoApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        ClienteRepository clientes = applicationContext.getBean(ClienteRepository.class);

        List<Cliente> todosClientes = clientes.listar();
        for (Cliente cliente : todosClientes){
            System.out.println(cliente.getNome());
        }


    }
}
