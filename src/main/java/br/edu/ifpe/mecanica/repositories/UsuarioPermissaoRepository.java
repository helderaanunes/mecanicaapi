package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.UsuarioPermissao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioPermissaoRepository extends CrudRepository<UsuarioPermissao,Long> {




}
