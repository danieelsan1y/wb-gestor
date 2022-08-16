package br.com.dagosolutions.WBGestor.repository;

import br.com.dagosolutions.WBGestor.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
