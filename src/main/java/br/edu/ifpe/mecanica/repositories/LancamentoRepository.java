package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.dtos.FluxoCaixaDTO;
import br.edu.ifpe.mecanica.entities.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {



        @Query("SELECT new br.edu.ifpe.mecanica.dtos.FluxoCaixaDTO(CAST(l.dataHora AS LocalDate), " +
                "SUM(CASE WHEN l.tipo = 'ENTRADA' THEN l.valor ELSE 0 END), " +
                "SUM(CASE WHEN l.tipo = 'SAIDA' THEN l.valor ELSE 0 END)) " +
                "FROM Lancamento l " +
                "WHERE l.dataHora >= :inicio " +
                "GROUP BY CAST(l.dataHora AS LocalDate) " +
                "ORDER BY CAST(l.dataHora AS LocalDate) ASC")
        List<FluxoCaixaDTO> buscarFluxoSemanal(LocalDateTime inicio);
}