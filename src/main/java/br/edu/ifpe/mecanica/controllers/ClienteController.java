package br.edu.ifpe.mecanica.controllers;

<<<<<<< Updated upstream
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

=======
import java.util.List;

import org.springframework.web.bind.annotation.*;

import br.edu.ifpe.mecanica.entities.Cliente;
import br.edu.ifpe.mecanica.services.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("*")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
>>>>>>> Stashed changes
}