package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String placa;
    @ManyToOne
    private Modelo modelo;
    private int anoFabricacao;
    private int anoModelo;
    @ManyToOne
    private Cliente proprietario;

}
