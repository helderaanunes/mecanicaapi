package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.VendaProduto;
import br.edu.ifpe.mecanica.repositories.VendaProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VendaProdutoService {
    @Autowired
    private VendaProdutoRepository repository;

    public List<VendaProduto> listarTodos() { return repository.findAll(); }
    public Optional<VendaProduto> buscarPorId(Long id) { return repository.findById(id); }
    public VendaProduto salvar(VendaProduto obj) { return repository.save(obj); }
    public void deletar(Long id) { repository.deleteById(id); }
}