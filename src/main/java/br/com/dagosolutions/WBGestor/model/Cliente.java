package br.com.dagosolutions.WBGestor.model;

import br.com.dagosolutions.WBGestor.model.enums.StatusCliente;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @Column(name = "id_cliente", nullable = false)
    private Long id;

    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "status_cliente")
    private StatusCliente statusCliente;

    @Column(name = "cpf_cliente")
    private String cpf;

    @Column(name = "data_de_nascimento_cliente")
    private LocalDate dataDeNacimento;

    @Column(name = "endereco_cliente")
    private String endereco;

    @Column(name = "telefone_cliente")
    private String telefone;

    @Column(name = "cr_cliente")
    private String cr;

    @Column(name = "validade_cr_cliente")
    private LocalDate validadeCR;

    @OneToMany(mappedBy = "cliente")
    private List<Arma> armas;

    @OneToMany(mappedBy = "cliente")
    private List<Municao> municoes;

    @OneToMany(mappedBy = "cliente")
    private List<Movimentacao> movimentacoes;

}
