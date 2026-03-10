package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.ProdutoOrdemServio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoOrdemServioRepository extends CrudRepository<ProdutoOrdemServio, Long> {
}
