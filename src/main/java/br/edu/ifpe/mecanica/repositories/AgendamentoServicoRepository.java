package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.AgendamentoServico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoServicoRepository extends CrudRepository<AgendamentoServico, Long> {
}
