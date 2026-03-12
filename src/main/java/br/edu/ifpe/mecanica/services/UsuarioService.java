package br.edu.ifpe.mecanica.services;


import br.edu.ifpe.mecanica.entities.Usuario;
import br.edu.ifpe.mecanica.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service



public class UsuarioService {

    //Injeção de dependência:
    @Autowired
    private UsuarioRepository repository;

    // Listar todos os usuários
    public List<Usuario> listarTodos() {
        return (List<Usuario>) repository.findAll();
    }

    // Buscar por ID
    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Salvar ou Atualizar
    public Usuario salvar(Usuario usuario) {
        // Aqui você pode adicionar validações, como verificar se o e-mail já existe
        return repository.save(usuario);
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

            // Cuidado: Em uma app real, a senha exigiria uma lógica de hash separada
            usuarioExistente.setSenha(usuarioAtualizado.getSenha());

            // 3. Salvamos a instância atualizada
            return repository.save(usuarioExistente);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado com o id: " + id));
    }

}
