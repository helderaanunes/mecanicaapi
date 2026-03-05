package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.OrdemServico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemServicoRepository extends
        CrudRepository<OrdemServico,Long>{
//                          ^
//                 Aqui é a classe de VCS!!
}
