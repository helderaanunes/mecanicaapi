package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Cliente;
import br.edu.ifpe.mecanica.repositories.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private clienteRepository repository;

    // Salvar cliente
    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }

    // Listar todos
    public Iterable<Cliente> listarTodos(){
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Cliente> buscarPorId(Long id){
        return repository.findById(id);
    }

    // Atualizar cliente
    public Cliente atualizar(Long id, Cliente cliente){

        Optional<Cliente> clienteExistente = repository.findById(id);

        if(clienteExistente.isPresent()){
            Cliente c = clienteExistente.get();

            c.setNome(cliente.getNome());
            c.setCelular(cliente.getCelular());
            c.setEmail(cliente.getEmail());
            c.setLogradouro(cliente.getLogradouro());
            c.setNumero(cliente.getNumero());
            c.setComplemento(cliente.getComplemento());
            c.setBairro(cliente.getBairro());
            c.setCidade(cliente.getCidade());
            c.setUf(cliente.getUf());
            c.setCep(cliente.getCep());
            c.setCpfCnpj(cliente.getCpfCnpj());

            return repository.save(c);
        }

        return null;
    }

    // Deletar cliente
    public void deletar(Long id){
        repository.deleteById(id);
    }

}