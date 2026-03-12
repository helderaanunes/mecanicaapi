package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Marca;
import br.edu.ifpe.mecanica.services.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
    @RequestMapping("/marcas")
    public class MarcaController {

        private final MarcaService marcaService;

        public MarcaController(MarcaService marcaService) {
            this.marcaService = marcaService;
        }

        @GetMapping
        public Iterable<Marca> listarTodas() {
            return marcaService.listarTodos();
        }

        @GetMapping("/{id}")
        public Optional<Marca> buscarPorId(@PathVariable Long id) {
            return marcaService.buscarPorId(id);
        }

        @PostMapping
        public Marca salvar(@RequestBody Marca marca) {
            return marcaService.salvar(marca);
        }

        @PutMapping("/{id}")
        public Marca atualizar(@PathVariable Long id, @RequestBody Marca marca) {
            return marcaService.atualizar(id, marca);
        }

        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Long id) {
            marcaService.deletar(id);
        }
    }

