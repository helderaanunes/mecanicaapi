package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.AgendamentoServico;
import br.edu.ifpe.mecanica.services.AgendamentoServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/agendamento-servicos")
public class AgendamentoServicoController {

    @Autowired
    private AgendamentoServicoService service;

    // GET - listar todos
    @GetMapping
    public Iterable<AgendamentoServico> listarTodos(){
        return service.listarTodos();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public Optional<AgendamentoServico> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    // POST - criar novo
    @PostMapping
    public AgendamentoServico criar(@RequestBody AgendamentoServico agendamentoServico){
        return service.salvar(agendamentoServico);
    }

    // PUT - atualizar
    @PutMapping("/{id}")
    public AgendamentoServico atualizar(
            @PathVariable Long id,
            @RequestBody AgendamentoServico agendamentoServico){
        return service.atualizar(id, agendamentoServico);
    }

    // DELETE - remover
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}