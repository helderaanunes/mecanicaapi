package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.VendaProduto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaProdutoRepository extends JpaRepository<VendaProduto, Long> {
}