package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class UsuarioPermissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario Usuaio;
    @ManyToOne
    private Permissao Permissao;

}
