package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dataHora;

    @ManyToOne
    private Veiculo veiculo;
    private double valorTotal;
    private double desconto;
    private double valorLiquido;
    @ManyToOne
    private Usuario usuario;
}
