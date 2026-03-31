package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.ProdutoVeiculo;
import br.edu.ifpe.mecanica.services.ProdutoVeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produto-veiculos")
public class ProdutoVeiculoController {

    @Autowired
    private ProdutoVeiculoService service;

    @GetMapping
    public Iterable<ProdutoVeiculo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoVeiculo> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public ProdutoVeiculo salvar(@RequestBody ProdutoVeiculo produtoVeiculo) {
        return service.salvar(produtoVeiculo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}