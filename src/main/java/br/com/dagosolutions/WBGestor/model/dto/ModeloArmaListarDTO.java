package br.com.dagosolutions.WBGestor.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModeloArmaListarDTO {

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
