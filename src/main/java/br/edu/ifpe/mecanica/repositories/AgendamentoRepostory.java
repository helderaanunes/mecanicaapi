package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Agendamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepostory
        extends CrudRepository<Agendamento,Long> {
}
