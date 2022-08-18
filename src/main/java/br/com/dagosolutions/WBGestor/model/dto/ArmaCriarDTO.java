package br.com.dagosolutions.WBGestor.model.dto;



public class ArmaCriarDTO {
    private String serie;
    private  String cor;
    private Long modeloArma;

    public ArmaCriarDTO(String serie, String cor, Long modeloArma) {
        this.serie = serie;
        this.cor = cor;
        this.modeloArma = modeloArma;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Long getModeloArma() {
        return modeloArma;
    }

    public void setModeloArma(Long modeloArma) {
        this.modeloArma = modeloArma;
    }
}
