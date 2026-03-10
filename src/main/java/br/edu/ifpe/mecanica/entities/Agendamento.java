package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Agendamento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Veiculo veiculo;
    private LocalDateTime dataHora;
    @ManyToOne
    private Usuario usuario;
}
