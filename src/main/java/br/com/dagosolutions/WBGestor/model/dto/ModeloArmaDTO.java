package br.com.dagosolutions.WBGestor.model.dto;


import br.com.dagosolutions.WBGestor.model.ModeloArma;

public class ModeloArmaDTO {

    private Long id;

    private String tamanho;

    private int quantidadeDeCano;

    private String alma;

    private String calibre;

    private int capacidade;

    private String marca;

    private String modelo;

    private String paisFabricacao;

    private Double preco;


    public ModeloArmaDTO(String tamanho, int quantidadeDeCano, String alma, String calibre, int capacidade, String marca, String modelo, String paisFabricacao, Double preco) {
        this.tamanho = tamanho;
        this.quantidadeDeCano = quantidadeDeCano;
        this.alma = alma;
        this.calibre = calibre;
        this.capacidade = capacidade;
        this.marca = marca;
        this.modelo = modelo;
        this.paisFabricacao = paisFabricacao;
        this.preco = preco;
    }

    public ModeloArmaDTO(ModeloArma modeloArma) {
        this.id = modeloArma.getId();
        this.tamanho = String.valueOf(modeloArma.getTamanho());
        this.quantidadeDeCano = modeloArma.getQuantidadeDeCano();
        this.alma = String.valueOf(modeloArma.getAlma());
        this.calibre = modeloArma.getCalibre();
        this.capacidade = modeloArma.getCapacidade();
        this.marca = modeloArma.getMarca();
        this.modelo = modeloArma.getModelo();
        this.paisFabricacao = modeloArma.getPaisFabricacao();
        this.preco = modeloArma.getPreco();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeDeCano() {
        return quantidadeDeCano;
    }

    public void setQuantidadeDeCano(int quantidadeDeCano) {
        this.quantidadeDeCano = quantidadeDeCano;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPaisFabricacao() {
        return paisFabricacao;
    }

    public void setPaisFabricacao(String paisFabricacao) {
        this.paisFabricacao = paisFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
