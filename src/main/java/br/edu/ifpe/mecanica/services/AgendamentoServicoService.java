package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Agendamento;
import br.edu.ifpe.mecanica.entities.AgendamentoServico;
import br.edu.ifpe.mecanica.repositories.AgendamentoServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgendamentoServicoService {
    @Autowired
    private AgendamentoServicoRepository repository;

    public Iterable<AgendamentoServico> listarTodos(){
        return repository.findAll();
    }

    public Optional<AgendamentoServico> buscarPorId(Long id){
        return repository.findById(id);
    }

    public AgendamentoServico salvar(AgendamentoServico agendamentoServico){
        return repository.save(agendamentoServico);
    }

    public AgendamentoServico atualizar(Long id, AgendamentoServico novo){
        Optional<AgendamentoServico> existente = repository.findById(id);

        if(existente.isPresent()){
            AgendamentoServico ag = existente.get();
            ag.setAgendamento(novo.getAgendamento());
            ag.setServico(novo.getServico());

            return repository.save(ag);
        }

        return null;
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}
