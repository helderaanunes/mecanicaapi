package br.edu.ifpe.mecanica.services;


import br.edu.ifpe.mecanica.entities.Modelo;
import br.edu.ifpe.mecanica.repositories.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    // Listar todos
    public Iterable<Modelo> listarTodos() {
        return modeloRepository.findAll();
    }

    // Buscar por ID
    public Optional<Modelo> buscarPorId(Long id) {
        return modeloRepository.findById(id);
    }

    // Salvar
    public Modelo salvar(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    // Atualizar
    public Modelo atualizar(Long id, Modelo modeloAtualizado) {
        Optional<Modelo> modeloExistente = modeloRepository.findById(id);

        if (modeloExistente.isPresent()) {
            Modelo modelo = modeloExistente.get();
            modelo.setDescricao(modeloAtualizado.getDescricao());
            modelo.setMarca(modeloAtualizado.getMarca());
            return modeloRepository.save(modelo);
        }

        return null;
    }

    // Deletar
    public void deletar(Long id) {
        modeloRepository.deleteById(id);
    }

}
