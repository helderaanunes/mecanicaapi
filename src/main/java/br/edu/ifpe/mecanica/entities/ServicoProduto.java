package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.Entity;
import lombok.Data;

    package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

    @Entity
    @Data

    public class ServicoProduto {
        @Id
        @GeneratedValue(strategy  = GenerationType.IDENTITY)
        private Long id;
        private String servico;
        private Produto;
        private int QuantidadeUtiliza;

}
