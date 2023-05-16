package com.caio.lavajato.domain;

import lombok.Data;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
@Data
public class Lavagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    private Veiculo veiculo;
    private Long tempoGastoEmMinutos;
//    private List<Procedimento> procedimentosFeitos;
    private Long valor;
    private Long desconto;
    private Long valorFinal;
    private Status status;
    private LocalDateTime dataDeAgendamento;
}
