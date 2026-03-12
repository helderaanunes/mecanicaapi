package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Modelo;
import br.edu.ifpe.mecanica.services.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private ModeloService modeloService;

    // Listar todos
    @GetMapping
    public Iterable<Modelo> listarTodos() {
        return modeloService.listarTodos();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Modelo buscarPorId(@PathVariable Long id) {
        return modeloService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Modelo não encontrado"));
    }

    // Criar
    @PostMapping
    public Modelo salvar(@RequestBody Modelo modelo) {
        return modeloService.salvar(modelo);
    }

    // Atualizar
    @PutMapping("/{id}")
    public Modelo atualizar(@PathVariable Long id, @RequestBody Modelo modelo) {
        return modeloService.atualizar(id, modelo);
    }

    // Deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        modeloService.deletar(id);
    }
}