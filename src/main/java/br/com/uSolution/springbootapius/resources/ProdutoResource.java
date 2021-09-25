package br.com.uSolution.springbootapius.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uSolution.springbootapius.Services.ProdutoService;
import br.com.uSolution.springbootapius.models.Produto;

@RestController
@RequestMapping("/produto/v1")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping("")
	public ResponseEntity<List<Produto>> listAll(){
		return ResponseEntity.ok(service.getProdutos());
	}

}
