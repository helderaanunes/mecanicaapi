package br.edu.ifpe.mecanica.services;


import br.edu.ifpe.mecanica.entities.Marca;
import br.edu.ifpe.mecanica.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public Iterable<Marca> listarTodos() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> buscarPorId(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca salvar(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca atualizar(Long id, Marca novaMarca) {
        Optional<Marca> marcaExistente = marcaRepository.findById(id);

        if (marcaExistente.isPresent()) {
            Marca marca = marcaExistente.get();
            marca.setDescricao(novaMarca.getDescricao());
            return marcaRepository.save(marca);
        }

        return null;
    }

    public void deletar(Long id) {
        marcaRepository.deleteById(id);
    }
}
