package br.edu.ifpe.mecanica.controllers;


import br.edu.ifpe.mecanica.entities.Usuario;
import br.edu.ifpe.mecanica.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios") // Rota base: http://localhost:8080/usuarios
public class UsuarioController {


    @Autowired
    private UsuarioService service;

    // GET: Listar todos:
    @GetMapping
    public List<Usuario> listar() {
        return service.listarTodos();
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST: Criar novo usuário:
    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        Usuario novoUsuario = service.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    // PUT: Atualizar usuário existente:
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        try {
            Usuario atualizado = service.atualizar(id, usuario);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE: Remover usuário:
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }


}
