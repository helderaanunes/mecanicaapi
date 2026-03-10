package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data


public class ProdutoVeiculo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Veiculo veiculo;
    private int anoModelo;


}
