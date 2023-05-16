package com.caio.lavajato.jpa;

import com.caio.lavajato.LavajatoApplication;
import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.domain.Veiculo;
import com.caio.lavajato.infrastructure.repository.ClienteRepository;
import com.caio.lavajato.infrastructure.repository.VeiculoRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class ConsultaVeiculoMain {

    public static void main(String[]args){
        ApplicationContext applicationContext = new SpringApplicationBuilder(LavajatoApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        VeiculoRepository veiculoRepository = applicationContext.getBean(VeiculoRepository.class);

        List<Veiculo> todosVeiculo = veiculoRepository.todos();
        for (Veiculo veiculo : todosVeiculo){
            System.out.printf("%s - %s - %s/n", veiculo.getPlaca(), veiculo.getModelo(), veiculo.getCliente().getNome() );
        }


    }
}
