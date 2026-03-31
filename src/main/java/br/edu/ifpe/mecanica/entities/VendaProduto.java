package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VendaProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Venda venda;

    @ManyToOne
    private Produto produto;

    private int quantidade;
    private double valorProduto;
}