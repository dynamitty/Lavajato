package com.caio.lavajato.infrastructure.repository;

import com.caio.lavajato.domain.Procedimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProcedimentoRepositoryImpl implements ProcedimentoRepository {


    @PersistenceContext
    private EntityManager manager ;

    @Override
    public List<Procedimento> listar(){
        return manager.createQuery("from Procedimento",Procedimento.class)
                .getResultList();
    }
    @Override
    public Procedimento porId(Long id){
        return manager.find(Procedimento.class, id);
    }

    @Override
    @Transactional
    public Procedimento adicionar(Procedimento procedimento){
        return manager.merge(procedimento);
    }

    @Override
    @Transactional
    public void remover(Procedimento procedimento) {
        procedimento = porId(procedimento.getId());
        manager.remove(procedimento);
    }
}
