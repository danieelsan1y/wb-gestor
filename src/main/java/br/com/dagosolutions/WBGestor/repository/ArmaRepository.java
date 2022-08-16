package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmaRepository extends JpaRepository<Arma,Long> {
}
