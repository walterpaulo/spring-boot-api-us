package br.com.uSolution.springbootapius.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uSolution.springbootapius.models.Produto;
import br.com.uSolution.springbootapius.repositorys.ProdutoRepository;
import br.com.uSolution.springbootapius.services.exception.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public void saveAll(List<Produto> entities) {
		repository.saveAll(entities);
	}

	public List<Produto> getProdutos() {
		List<Produto> obj = repository.findAll();
		return obj;
	}

	public Produto getId(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado!: " + id + ", " + Produto.class.getName()));
	}

	public void deleteById(Integer id) {
		Produto obj = getId(id);
		repository.deleteById(obj.getId());
	}

	public Produto save(Produto produto) {
		Produto obj = repository.save(produto);
		return obj;
	}

	public Produto update(Produto produto) {
		Produto achei = getId(produto.getId());
		produto.setId(achei.getId());
		Produto obj = repository.save(popularProduto(produto));
		return obj;
	}

	private Produto popularProduto(Produto produto) {
		Produto obj = new Produto(produto.getId(), produto.getNome(), produto.getValor());
		return obj;
	}

}
