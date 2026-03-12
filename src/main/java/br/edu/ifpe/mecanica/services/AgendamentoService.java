package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Agendamento;
import br.edu.ifpe.mecanica.repositories.AgendamentoRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepostory repository;

    public Iterable<Agendamento> listarTodos(){
        return repository.findAll();
    }

    public Optional<Agendamento> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Agendamento salvar(Agendamento agendamento){
        return repository.save(agendamento);
    }

    public Agendamento atualizar(Long id, Agendamento agendamentoAtualizado){
        Optional<Agendamento> agendamentoExistente = repository.findById(id);

        if(agendamentoExistente.isPresent()){
            Agendamento agendamento = agendamentoExistente.get();
            agendamento.setVeiculo(agendamentoAtualizado.getVeiculo());
            agendamento.setUsuario(agendamentoAtualizado.getUsuario());
            agendamento.setDataHora(agendamentoAtualizado.getDataHora());

            return repository.save(agendamento);
        }

        return null;
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
