package br.edu.ifpe.mecanica.repositories;

import br.edu.ifpe.mecanica.entities.ProdutoVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoVeiculoRepository extends JpaRepository<ProdutoVeiculo, Long> {
}