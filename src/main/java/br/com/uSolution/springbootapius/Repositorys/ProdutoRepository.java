package br.com.uSolution.springbootapius.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uSolution.springbootapius.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
