package br.edu.ifpe.mecanica.repositories;


import br.edu.ifpe.mecanica.entities.Cliente;
import br.edu.ifpe.mecanica.entities.Venda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface VendaRepository extends CrudRepository<Venda, Long>{




}
