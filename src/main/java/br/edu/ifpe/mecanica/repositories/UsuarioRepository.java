package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    //                                                      ^
    //                                        AQUI É A CLASSE!
}
