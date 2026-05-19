package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.dtos.FluxoCaixaDTO;
import br.edu.ifpe.mecanica.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lancamentos")
@CrossOrigin(origins = "*") // Porta padrão do React
public class LancamentoController {

    @Autowired
    private LancamentoService service;

    @GetMapping("/fluxo-semanal")
    public List<FluxoCaixaDTO> listarFluxoSemanal() {
        return service.getFluxoUltimaSemana();
    }
}