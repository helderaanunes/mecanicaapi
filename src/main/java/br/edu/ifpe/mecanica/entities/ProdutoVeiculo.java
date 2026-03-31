package br.edu.ifpe.mecanica.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProdutoVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Veiculo veiculo;

    private int anoModelo;
}