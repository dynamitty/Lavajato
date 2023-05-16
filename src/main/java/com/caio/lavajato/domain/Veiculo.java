package com.caio.lavajato.domain;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cor;
    @Column
    private String modelo;
    @Column
    private String marca;
    @Column(nullable = false)
    private String placa;
    @ManyToOne
    private Cliente cliente;

}
