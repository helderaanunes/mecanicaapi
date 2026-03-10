package br.edu.ifpe.mecanica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AgendamentoRepositores {
    extends CrudRepository <Agendamento,Long> {

    }
}
