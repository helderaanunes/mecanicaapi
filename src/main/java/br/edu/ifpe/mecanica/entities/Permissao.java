package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Permissao {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
