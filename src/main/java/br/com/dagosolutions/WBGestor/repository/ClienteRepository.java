package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("SELECT c FROM Cliente c WHERE c.id = :id")
    public Cliente buscarPorId(@Param("id") Long id);
}
