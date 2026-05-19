package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.dtos.FluxoCaixaDTO;
import br.edu.ifpe.mecanica.repositories.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public List<FluxoCaixaDTO> getFluxoUltimaSemana() {
        LocalDateTime inicio = LocalDateTime.now().minusDays(7);
        return repository.buscarFluxoSemanal(inicio);
    }
}
