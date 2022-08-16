package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.Municao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicaoRepository extends JpaRepository<Municao,Long> {
}
