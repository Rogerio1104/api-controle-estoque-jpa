package br.com.senac.api.repositorios;

import br.com.senac.api.entidades.Estoques;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoquesRepository extends JpaRepository<Estoques, Long> {
}
