package br.com.senac.api.repositorios;


import br.com.senac.api.entidades.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>  {

}
