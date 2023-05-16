package com.caio.lavajato.domain;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column
    private String sobrenome;
    @Column(name = "cfp", length = 11)
    private String cpf;
    @Column(name = "cnpj", length = 14)
    private String cnpj;
    @Column(name = "ddd", length = 2)
    private String ddd;
    @Column(name = "telefone", length = 9)
    private String telefone;
    @Column
    private String endereco;

}
