package br.com.uSolution.springbootapius.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uSolution.springbootapius.Repositorys.ProdutoRepository;
import br.com.uSolution.springbootapius.models.Produto;

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

}
