package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.ServicoOrdemServico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoOrdemServicoRepository extends CrudRepository<ServicoOrdemServico,Long> {

}
