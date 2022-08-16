package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.ModeloArma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ModeloArmaRepository extends JpaRepository<ModeloArma,Long> {

    @Query("SELECT m FROM ModeloArma m WHERE m.id = :id")
    public ModeloArma findBYId(@Param("id") Long id);
}
