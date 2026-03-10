package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data

    public class ServicoProduto {
        @Id
        @GeneratedValue(strategy  = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        private Servico servico;
        @ManyToOne
        private  Produto produto;
        private int quantidadeUtilizado;

}
