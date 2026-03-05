package br.edu.ifpe.mecanica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends CrudRepository<ModeloServico, Long> {

}
