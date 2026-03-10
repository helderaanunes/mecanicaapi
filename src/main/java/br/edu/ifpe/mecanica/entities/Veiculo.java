package br.edu.ifpe.mecanica.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Veiculo {

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
