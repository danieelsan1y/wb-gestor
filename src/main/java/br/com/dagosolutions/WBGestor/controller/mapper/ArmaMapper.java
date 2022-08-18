package br.com.dagosolutions.WBGestor.controller.mapper;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.dto.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArmaMapper {
    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ArmaCriarDTO toArmaCriarDTO(Arma arma) {
        return MODEL_MAPPER.map(arma, ArmaCriarDTO.class);
    }

    public Arma armaCriarDTOToArma(ArmaCriarDTO armaCriarDTO) {
        return MODEL_MAPPER.map(armaCriarDTO, Arma.class);
    }

    public Arma ArmaGerirDTO(ArmaGerirDTO armaGerirDTO) {
        return MODEL_MAPPER.map(armaGerirDTO, Arma.class);
    }

    public List<ArmaListarDataNulaDTO> toArmaListarDataNulaDTOList(List<Arma> armas) {
        List<ArmaListarDataNulaDTO> armaListarDataNulaDTOS = armas.stream().map(arma -> new
                ArmaListarDataNulaDTO(arma)).collect(Collectors.toList()
        );
        return armaListarDataNulaDTOS;
    }

    public List<ArmaListarDataSaidaNuloClienteNuloDTO> toArmaListarDataSaidaNuloClienteNuloDTOList(List<Arma> armas) {
        List<ArmaListarDataSaidaNuloClienteNuloDTO> armaListarDataSaidaNuloClienteNuloDTOS = armas.stream().map(arma -> new
                ArmaListarDataSaidaNuloClienteNuloDTO(arma)).collect(Collectors.toList()
        );
        return armaListarDataSaidaNuloClienteNuloDTOS;
    }

    public List<ArmaListarNaoNulosDTO> toArmaArmaListarNaoNulosDTOList(List<Arma> armas) {
        List<ArmaListarNaoNulosDTO> armaListarNaoNulosDTOS = armas.stream().map(arma -> new
                ArmaListarNaoNulosDTO(arma.getId(), arma.getSerie(), arma.getCor(), arma.getDataEntrada(),arma.getDataSaida(),
                arma.getStatus(),arma.getModeloArma().getModelo(),arma.getCliente().getNome())).collect(Collectors.toList()
        );
        return armaListarNaoNulosDTOS;
    }


}
