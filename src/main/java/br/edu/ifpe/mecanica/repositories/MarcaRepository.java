package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Marca;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Long> {

}
