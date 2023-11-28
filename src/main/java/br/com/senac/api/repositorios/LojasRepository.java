package br.com.senac.api.repositorios;

import br.com.senac.api.entidades.Lojas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojasRepository extends JpaRepository<Lojas, Long> {

}
