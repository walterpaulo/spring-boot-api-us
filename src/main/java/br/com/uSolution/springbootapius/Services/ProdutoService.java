package br.com.uSolution.springbootapius.Services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uSolution.springbootapius.Repositorys.ProdutoRepository;
import br.com.uSolution.springbootapius.models.Produto;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository service;
	
	
	public List<Produto> addAll(List<Produto> list){
		return service.saveAll(list);
	}

}
