package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Modelo;
import br.edu.ifpe.mecanica.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository repository;

    public List<Modelo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Modelo> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Modelo salvar(Modelo modelo) {
        return repository.save(modelo);
    }

    public Modelo atualizar(Long id, Modelo modeloAtualizado) {
        return repository.findById(id).map(modelo -> {
            modelo.setDescricao(modeloAtualizado.getDescricao());
            modelo.setMarca(modeloAtualizado.getMarca());
            return repository.save(modelo);
        }).orElseThrow(() -> new RuntimeException("Modelo não encontrado"));
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}