package br.edu.ifpe.mecanica.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifpe.mecanica.entities.Permissao;
import br.edu.ifpe.mecanica.repositories.PermissaoRepository;

@Service
public class PermissaoService {

    private final PermissaoRepository repository;

    public PermissaoService(PermissaoRepository repository) {
        this.repository = repository;
    }

    public List<Permissao> listar() {
        return repository.findAll();
    }

    public Permissao buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Permissão não encontrada"));
    }

    public Permissao salvar(Permissao permissao) {
        return repository.save(permissao);
    }

    public Permissao atualizar(Long id, Permissao permissao) {
        Permissao existente = buscar(id);
        existente.setDescricao(permissao.getDescricao());
        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}