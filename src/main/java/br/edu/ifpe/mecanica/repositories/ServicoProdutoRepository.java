package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.ServicoProduto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ServicoProdutoRepository 
    extends CrudRepository <ServicoProduto,Long> {


}
