package br.com.dagosolutions.WBGestor.model;

import br.com.dagosolutions.WBGestor.model.enums.Status;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_arma")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Arma {

    @Id
    @Column(name = "id_arma")
    private Long id;

    @Column(name = "serie_arma")
    private String serie;

    @Column(name = "cor_arma")
    private String cor;

    @Column(name = "data_entrada_arma")
    private LocalDate dataEntrada;

    @Column(name = "data_saida_arma")
    private LocalDate dataSaida;

    @Column(name = "status_arma")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_modelo_arma")
    private ModeloArma modeloArma;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


}
