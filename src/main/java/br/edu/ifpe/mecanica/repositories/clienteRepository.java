package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface clienteRepository extends CrudRepository<Cliente, Long> {



}
