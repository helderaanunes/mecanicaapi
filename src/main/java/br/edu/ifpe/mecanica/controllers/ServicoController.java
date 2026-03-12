package br.edu.ifpe.mecanica.controllers;

import br.edu.ifpe.mecanica.entities.Servico;
import br.edu.ifpe.mecanica.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ServicoController {
    @RestController
    @RequestMapping("/servicos")
    public class servicoController {

        @Autowired
        private ServicoService service;

        // POST - criar serviço
        @PostMapping
        public Servico salvar(@RequestBody Servico servico) {
            return service.salvar(servico);
        }

        // GET - listar todos
        @GetMapping
        public List<Servico> listarTodos() {
            return (List<Servico>) service.listarTodos();
        }

        // GET - buscar por id
        @GetMapping("/{id}")
        public Optional<Servico> buscarPorId(@PathVariable Long id) {
            return service.buscarPorId(id);
        }

        // PUT - atualizar
        @PutMapping("/{id}")
        public Servico atualizar(@PathVariable Long id, @RequestBody Servico servico) {
            return service.atualizar(id, servico);
        }

        // DELETE - deletar
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Long id) {
            service.deletar(id);
        }
    }
}
