package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProdutoRepository extends
        CrudRepository <Produto,Long>{
    
}
