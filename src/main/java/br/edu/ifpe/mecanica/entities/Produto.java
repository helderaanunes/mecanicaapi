package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Produto {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double precoFornecedor;
    private Double precoVenda;
    private  int quantidadeEstoque;
}
