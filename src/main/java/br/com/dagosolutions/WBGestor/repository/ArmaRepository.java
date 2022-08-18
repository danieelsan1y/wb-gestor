package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmaRepository extends JpaRepository<Arma,Long> {

    @Query("SELECT a FROM Arma a WHERE a.id = :id")
    public Arma findBYId(@Param("id") Long id);

    @Query("SELECT a FROM Arma a WHERE a.dataSaida != null AND a.cliente != null")
    public List<Arma> buscarArmasSemCamposNulos();

    @Query("SELECT a FROM Arma a WHERE a.dataSaida = null AND a.cliente != null")
    public List<Arma> buscarArmasComDataNula();

    @Query("SELECT a FROM Arma a WHERE a.cliente = null AND a.dataSaida = null")
    public List<Arma> buscarArmasComClienteNuloDataNula();

}
