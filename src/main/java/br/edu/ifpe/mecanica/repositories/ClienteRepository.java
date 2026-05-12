package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
