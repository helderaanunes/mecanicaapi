package br.edu.ifpe.mecanica.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class FluxoCaixaDTO {
    private LocalDate data;
    private Double totalEntrada;
    private Double totalSaida;
}