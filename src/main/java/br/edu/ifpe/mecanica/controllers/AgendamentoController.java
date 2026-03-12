package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Agendamento;
import br.edu.ifpe.mecanica.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// Define que essa classe é um Controller REST
// Todos os métodos retornarão JSON automaticamente
@RestController

// Define a rota base da API
@RequestMapping("/agendamentos")
public class AgendamentoController {

    // Injeta o service do agendamento
    @Autowired
    private AgendamentoService service;

    // GET /agendamentos
    // Lista todos os agendamentos
    @GetMapping
    public Iterable<Agendamento> listarTodos(){
        return service.listarTodos();
    }

    // GET /agendamentos/{id}
    // Busca um agendamento específico pelo ID
    @GetMapping("/{id}")
    public Optional<Agendamento> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    // POST /agendamentos
    // Cria um novo agendamento
    @PostMapping
    public Agendamento salvar(@RequestBody Agendamento agendamento){
        return service.salvar(agendamento);
    }

    // PUT /agendamentos/{id}
    // Atualiza um agendamento existente
    @PutMapping("/{id}")
    public Agendamento atualizar(
            @PathVariable Long id,
            @RequestBody Agendamento agendamento){

        return service.atualizar(id, agendamento);
    }

    // DELETE /agendamentos/{id}
    // Remove um agendamento
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}