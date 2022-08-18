package br.com.dagosolutions.WBGestor.model.dto;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.enums.StatusArma;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

public class ArmaListarDataSaidaNuloClienteNuloDTO extends ArmaListarNaoNulosDTO {


    public ArmaListarDataSaidaNuloClienteNuloDTO(Arma arma) {
        super(arma.getId(), arma.getSerie(), arma.getCor(), arma.getDataEntrada(),
                arma.getStatus(),arma.getModeloArma().getModelo());
    }
}
