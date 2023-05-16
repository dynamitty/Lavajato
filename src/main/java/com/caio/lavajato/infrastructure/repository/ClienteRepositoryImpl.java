package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class ClienteRepositoryImpl implements ClienteRepository {


    @PersistenceContext
    private EntityManager manager ;

    @Override
    public List<Cliente> listar(){
        return manager.createQuery("from Cliente",Cliente.class)
                .getResultList();
    }
    @Override
    public Cliente porId(Long id){
        return manager.find(Cliente.class, id);
    }

    @Override
    @Transactional
    public Cliente adicionar(Cliente cliente){
        return manager.merge(cliente);
    }

    @Override
    @Transactional
    public void remover(Cliente cliente) {
        cliente = porId(cliente.getId());
        manager.remove(cliente);
    }
}
