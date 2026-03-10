package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AgendamentoServico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Agendamento agendamento;
    @ManyToOne
    private Servico servico;

}
