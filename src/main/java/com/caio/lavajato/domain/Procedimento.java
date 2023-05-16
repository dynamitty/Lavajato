package com.caio.lavajato.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Procedimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column
    private Long duracaoDoProdutoEmDias;
    @Column(nullable = false)
    private Long valor;
    @Column
    private Long custoInterno;
    @Column
    private Long tempoMedioDoProdutoEmMinutos;


}
