package br.edu.ifpe.mecanica.entities;

import br.edu.ifpe.mecanica.enums.TipoLancamento;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Double valor;
    private LocalDateTime dataHora;

    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo; // ENTRADA ou SAIDA
}