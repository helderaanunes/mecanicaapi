package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Marca;
import br.edu.ifpe.mecanica.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
@CrossOrigin(origins = "*") // Permite que o seu Front-end acesse a API
public class MarcaController {

    @Autowired
    private MarcaService service;

    @GetMapping
    public List<Marca> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return service.salvar(marca);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Marca> atualizar(@PathVariable Long id, @RequestBody Marca marca) {
        try {
            return ResponseEntity.ok(service.atualizar(id, marca));
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}