package br.com.dagosolutions.WBGestor.model;

import br.com.dagosolutions.WBGestor.model.enums.Alma;
import br.com.dagosolutions.WBGestor.model.enums.Tamanho;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tb_modelo_arma")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ModeloArma {
    @Id
    @Column(name = "id_modelo_arma", nullable = false)
    private Long id;

    @Column(name = "tamanho_modelo_arma")
    private Tamanho tamanho;

    @Column(name = "quantidade_de_cano_modelo_arma")
    private int quantidadeDeCano;

    @Column(name = "alma_modelo_arma")
    private Alma alma ;

    @Column(name = "calibre_modelo_arma")
    private String calibre;

    @Column(name = "capacidade_modelo_arma")
    private int capacidade;

    @Column(name = "marca_modelo_arma")
    private String marca;

    @Column(name = "modelo_modelo_arma")
    private String modelo;

    @Column(name = "pais_fabricacao_modelo_arma")
    private String paisFabricacao;

    @Column(name = "preco_modelo_arma")
    private Double preco;

    @OneToMany(mappedBy = "modeloArma")
    private List<Arma> armas;

}
