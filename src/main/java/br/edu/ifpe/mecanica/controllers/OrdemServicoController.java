package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.OrdemServico;
import br.edu.ifpe.mecanica.services.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ordens")
public class OrdemServicoController {

    @Autowired
    private OrdemServicoService service;

    @PostMapping
    public OrdemServico salvar(@RequestBody OrdemServico ordemServico){
        return service.salvar(ordemServico);
    }

    @GetMapping
    public Iterable<OrdemServico> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<OrdemServico> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public OrdemServico atualizar(@PathVariable Long id, @RequestBody OrdemServico ordemServico){
        return service.atualizar(id, ordemServico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}