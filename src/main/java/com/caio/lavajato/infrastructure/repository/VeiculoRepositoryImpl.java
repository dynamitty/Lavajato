package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Cliente;
import com.caio.lavajato.domain.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class VeiculoRepositoryImpl implements VeiculoRepository {


    @PersistenceContext
    private EntityManager manager ;

    @Override
    public List<Veiculo> todos(){
        return manager.createQuery("from Veiculo",Veiculo.class)
                .getResultList();
    }
    public Veiculo porCliente(Cliente cliente){
        return manager.find(Veiculo.class, cliente);
    }

    @Override
    @Transactional
    public Veiculo adicionar(Veiculo veiculo){
        return manager.merge(veiculo);
    }

    @Override
    @Transactional
    public void remover(Veiculo veiculo) {
        veiculo = porCliente(veiculo.getCliente());
        manager.remove(veiculo);
    }
}
