package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.OrdemServico;
import br.edu.ifpe.mecanica.repositories.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service

public class OrdemServicoService {
    @Autowired
    private OrdemServicoRepository repository;

    public OrdemServico salvar(OrdemServico ordemServico){

        // define data e hora da criação
        ordemServico.setDataHora(LocalDateTime.now());

        // calcula valor liquido
        double valorLiquido = ordemServico.getValorTotal() - ordemServico.getDesconto();
        ordemServico.setValorLiquido(valorLiquido);

        return repository.save(ordemServico);
    }

    public Iterable<OrdemServico> listar(){
        return repository.findAll();
    }

    public Optional<OrdemServico> buscarPorId(Long id){
        return repository.findById(id);
    }

    public OrdemServico atualizar(Long id, OrdemServico ordemServico){

        Optional<OrdemServico> existente = repository.findById(id);

        if(existente.isPresent()){

            OrdemServico os = existente.get();

            os.setVeiculo(ordemServico.getVeiculo());
            os.setUsuario(ordemServico.getUsuario());
            os.setValorTotal(ordemServico.getValorTotal());
            os.setDesconto(ordemServico.getDesconto());

            double valorLiquido = os.getValorTotal() - os.getDesconto();
            os.setValorLiquido(valorLiquido);

            return repository.save(os);
        }

        return null;
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}



