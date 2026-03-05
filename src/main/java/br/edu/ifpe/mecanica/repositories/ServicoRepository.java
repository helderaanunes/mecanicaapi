package br.edu.ifpe.mecanica.repositories;


import br.edu.ifpe.mecanica.entities.Servico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends CrudRepository<Servico,Long> {
}
