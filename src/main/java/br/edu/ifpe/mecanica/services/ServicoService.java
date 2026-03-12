package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Servico;
import br.edu.ifpe.mecanica.repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicoService{
    @Autowired
    private ServicoRepository repository;

    public Servico salvar(Servico servico) {
        return repository.save(servico);
    }

    // listar todos
    public Iterable<Servico> listarTodos() {
        return repository.findAll();
    }

    // buscar por id
    public Optional<Servico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // deletar
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    // atualizar
    public Servico atualizar(Long id, Servico servicoAtualizado) {
        Servico servico = repository.findById(id).orElseThrow();

        servico.setValor(servicoAtualizado.getValor());
        servico.setDescricao(servicoAtualizado.getDescricao());
        servico.setDuracao(servicoAtualizado.getDuracao());

        return repository.save(servico);
    }
}