package br.com.uSolution.springbootapius.Config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.uSolution.springbootapius.Services.ProdutoService;
import br.com.uSolution.springbootapius.models.Produto;

@Configuration
public class Inatition implements CommandLineRunner {

	@Autowired
	private ProdutoService service;
	
	@Override
	public void run(String... args) throws Exception {
		Produto pro1 = new Produto(null, "Arroz", new BigDecimal("23.99"));
		Produto pro2 = new Produto(null, "Leite", new BigDecimal("5"));
		Produto pro3 = new Produto(null, "Café", new BigDecimal("20.00"));
		
		service.addAll(Arrays.);
		
		
	}

} 
