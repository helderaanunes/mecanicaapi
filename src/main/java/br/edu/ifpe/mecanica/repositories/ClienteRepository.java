package br.edu.ifpe.mecanica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifpe.mecanica.entities.Cliente;
<<<<<<< Updated upstream
import br.edu.ifpe.mecanica.services.ClienteService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
=======
>>>>>>> Stashed changes

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

<<<<<<< Updated upstream
public interface clienteRepository extends CrudRepository<Cliente, Long> {

}

=======
}
>>>>>>> Stashed changes
