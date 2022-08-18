package br.com.dagosolutions.WBGestor.model.dto;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.enums.StatusArma;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

public class ArmaListarDTO {

    private Long id;
    private String serie;
    private String cor;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private StatusArma status;
    private String modeloArma;
    private String cliente;

    public ArmaListarDTO(Long id, String serie, String cor, LocalDate dataEntrada, LocalDate dataSaida, StatusArma status, String modeloArma, String cliente) {
        this.id = id;
        this.serie = serie;
        this.cor = cor;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.status = status;
        this.modeloArma = modeloArma;
        this.cliente = cliente;
    }

    public ArmaListarDTO(Arma arma) {
        this.id = arma.getId();
        this.serie = arma.getSerie();
        this.cor = arma.getCor();
        this.dataEntrada = arma.getDataEntrada();
        this.dataSaida = arma.getDataSaida();
        this.status = arma.getStatus();
        this.modeloArma = arma.getModeloArma().getModelo();
        this.cliente = arma.getCliente().getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public StatusArma getStatus() {
        return status;
    }

    public void setStatus(StatusArma status) {
        this.status = status;
    }

    public String getModeloArma() {
        return modeloArma;
    }

    public void setModeloArma(String modeloArma) {
        this.modeloArma = modeloArma;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
