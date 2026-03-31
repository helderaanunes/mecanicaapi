package br.edu.ifpe.mecanica.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;
    private double valorTotal;
    private double desconto;
    private double valorLiquido;
    @ManyToOne
    private Usuario usuario;

}
