package br.edu.ifpe.mecanica.services;
import br.edu.ifpe.mecanica.entities.ProdutoVeiculo;
import br.edu.ifpe.mecanica.repositories.ProdutoVeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoVeiculoService {
    @Autowired
    private ProdutoVeiculoRepository repository;

    public List<ProdutoVeiculo> listarTodos() { return repository.findAll(); }
    public Optional<ProdutoVeiculo> buscarPorId(Long id) { return repository.findById(id); }
    public ProdutoVeiculo salvar(ProdutoVeiculo obj) { return repository.save(obj); }
    public void deletar(Long id) { repository.deleteById(id); }
}