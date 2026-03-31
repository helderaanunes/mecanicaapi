package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data

public class ServicoOrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne
    private Servico servico;
    @ManyToOne
    private OrdemServico ordemServico;
    private int quantidade;
    private double valorServico;
}

