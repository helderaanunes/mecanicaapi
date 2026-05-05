package br.edu.ifpe.mecanica.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import br.edu.ifpe.mecanica.entities.Permissao;
import br.edu.ifpe.mecanica.services.PermissaoService;

@RestController
@RequestMapping("/api/permissoes")
@CrossOrigin("*")
public class PermissaoController {

    private final PermissaoService service;

    public PermissaoController(PermissaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Permissao> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Permissao buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PostMapping
    public Permissao salvar(@RequestBody Permissao permissao) {
        return service.salvar(permissao);
    }

    @PutMapping("/{id}")
    public Permissao atualizar(@PathVariable Long id, @RequestBody Permissao permissao) {
        return service.atualizar(id, permissao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}