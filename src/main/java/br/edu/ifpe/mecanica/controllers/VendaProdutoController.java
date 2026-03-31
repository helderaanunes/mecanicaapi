package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.VendaProduto;
import br.edu.ifpe.mecanica.services.VendaProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/venda-produtos")
public class VendaProdutoController {

    @Autowired
    private VendaProdutoService service;

    @GetMapping
    public Iterable<VendaProduto> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<VendaProduto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public VendaProduto salvar(@RequestBody VendaProduto vendaProduto) {
        return service.salvar(vendaProduto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}