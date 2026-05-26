package br.edu.ifpe.mecanica.services;


import br.edu.ifpe.mecanica.entities.Usuario;
import br.edu.ifpe.mecanica.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service



public class UsuarioService {

    //Injeção de dependência:
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Você precisará criar este Bean na SecurityConfigurations

    public Usuario salvar(Usuario usuario) {
        // Criptografando a senha antes de salvar no banco
        String senhaCriptografada = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(senhaCriptografada);

        return repository.save(usuario);
    }

    // Listar todos os usuários
    public List<Usuario> listarTodos() {
        return (List<Usuario>) repository.findAll();
    }

    // Buscar por ID
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }


    // Deletar
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        // 1. Verificamos se o usuário existe no banco
        return repository.findById(id).map(usuarioExistente -> {
            // 2. Atualizamos apenas os campos necessários
            usuarioExistente.setNome(usuarioAtualizado.getNome());
            usuarioExistente.setEmail(usuarioAtualizado.getEmail());

            String senhaCriptografada = passwordEncoder.encode(usuarioAtualizado.getSenha());
            usuarioExistente.setSenha(senhaCriptografada);

            // 3. Salvamos a instância atualizada
            return repository.save(usuarioExistente);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado com o id: " + id));
    }

}
