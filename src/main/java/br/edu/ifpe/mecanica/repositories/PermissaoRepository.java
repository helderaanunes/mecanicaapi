package br.edu.ifpe.mecanica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifpe.mecanica.entities.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}