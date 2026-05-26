package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    // O Spring Security usará este método para carregar o usuário no processo de login
    UserDetails findByEmail(String email);
}
