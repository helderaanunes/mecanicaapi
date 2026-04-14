package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Marca;
import br.edu.ifpe.mecanica.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository repository;

    public List<Marca> listarTodos() {
        return repository.findAll();
    }

    public Optional<Marca> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Marca salvar(Marca marca) {
        return repository.save(marca);
    }

    public Marca atualizar(Long id, Marca marcaAtualizada) {
        return repository.findById(id).map(marca -> {
            marca.setDescricao(marcaAtualizada.getDescricao());
            return repository.save(marca);
        }).orElseThrow(() -> new RuntimeException("Marca não encontrada com id: " + id));
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}