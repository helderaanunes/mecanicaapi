package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Permissao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PermissaoRepository extends CrudRepository <Permissao,Long> {
}
