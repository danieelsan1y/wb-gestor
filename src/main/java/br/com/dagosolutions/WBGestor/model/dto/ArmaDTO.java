package br.com.dagosolutions.WBGestor.model.dto;

import br.com.dagosolutions.WBGestor.model.ModeloArma;

public class ArmaDTO {
    private String serie;
    private  String cor;
    private ModeloArma modeloArma;

    public ArmaDTO(String serie, String cor, ModeloArma modeloArma) {
        this.serie = serie;
        this.cor = cor;
        this.modeloArma = modeloArma;
    }
}
