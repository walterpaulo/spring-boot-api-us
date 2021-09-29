package br.com.uSolution.springbootapius.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uSolution.springbootapius.models.Produto;
import br.com.uSolution.springbootapius.services.ProdutoService;
import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("/produto/v1")
public class ProdutoResource {

	@Autowired
	private ProdutoService service;

	@GetMapping("")
	public ResponseEntity<List<Produto>> listAll() {
		return ResponseEntity.ok(service.getProdutos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findId(@PathVariable Integer id) {

		Produto obj = service.getId(id);

		return ResponseEntity.ok(obj);

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Produto> delete(@PathVariable Integer id) {
		service.deleteById(id);
		return ResponseEntity.ok(null);

	}

}
