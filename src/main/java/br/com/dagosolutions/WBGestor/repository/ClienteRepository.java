package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
