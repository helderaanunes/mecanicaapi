package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
