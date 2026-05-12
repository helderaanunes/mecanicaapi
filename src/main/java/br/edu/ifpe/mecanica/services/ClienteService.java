package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Cliente;
import br.edu.ifpe.mecanica.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Iterable<Cliente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        Cliente cliente = repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        cliente.setNome(clienteAtualizado.getNome());
        cliente.setCelular(clienteAtualizado.getCelular());
        cliente.setEmail(clienteAtualizado.getEmail());
        cliente.setLogradouro(clienteAtualizado.getLogradouro());
        cliente.setNumero(clienteAtualizado.getNumero());
        cliente.setComplemento(clienteAtualizado.getComplemento());
        cliente.setBairro(clienteAtualizado.getBairro());
        cliente.setCidade(clienteAtualizado.getCidade());
        cliente.setUf(clienteAtualizado.getUf());
        cliente.setCep(clienteAtualizado.getCep());
        cliente.setCpfCnpj(clienteAtualizado.getCpfCnpj());

        return repository.save(cliente);
    }
}
