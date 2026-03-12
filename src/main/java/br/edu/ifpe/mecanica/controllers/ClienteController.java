package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Cliente;
import br.edu.ifpe.mecanica.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // Criar cliente
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return service.salvar(cliente);
    }

    // Listar todos os clientes
    @GetMapping
    public Iterable<Cliente> listarTodos(){
        return service.listarTodos();
    }

    // Buscar cliente por ID
    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    // Atualizar cliente
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return service.atualizar(id, cliente);
    }

    // Deletar cliente
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}