package br.edu.ifpe.mecanica.services;

import br.edu.ifpe.mecanica.entities.Produto;
import br.edu.ifpe.mecanica.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

  private final ProdutoRepository produtoRepository;

  public ProdutoService(ProdutoRepository produtoRepository) {
    this.produtoRepository = produtoRepository;
  }

  public Produto salvar(Produto produto){
    return produtoRepository.save(produto);
  }

  public Iterable<Produto> listarTodos(){
    return produtoRepository.findAll();
  }

  public Produto buscarPorId(Long id){
    return produtoRepository.findById(id).orElse(null);
  }

  public void deletar(Long id){
    produtoRepository.deleteById(id);
  }

  public Produto atualizar(Long id, Produto produtoAtualizado){
    Produto produto = buscarPorId(id);

    if(produto != null){
      produto.setDescricao(produtoAtualizado.getDescricao());
      produto.setPrecoFornecedor(produtoAtualizado.getPrecoFornecedor());
      produto.setPrecoVenda(produtoAtualizado.getPrecoVenda());
      produto.setQuantidadeEstoque(produtoAtualizado.getQuantidadeEstoque());

      return produtoRepository.save(produto);
    }

    return null;
  }
}
