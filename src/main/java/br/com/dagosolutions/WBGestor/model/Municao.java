package br.com.dagosolutions.WBGestor.model;

import br.com.dagosolutions.WBGestor.model.enums.Tipo;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_municao")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Municao {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "lote_municao")
    private String lote;

    @Column(name = "quantidade_municao")
    private Long quantidade;

    @Column(name = "tipo_municao")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


}
