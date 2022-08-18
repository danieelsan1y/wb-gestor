package br.com.dagosolutions.WBGestor.controller.mapper;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.dto.ArmaCriarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ArmaGerirDTO;
import br.com.dagosolutions.WBGestor.model.dto.ArmaListarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ArmaMapper {
    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ArmaCriarDTO toArmaCriarDTO(Arma arma) {
        return MODEL_MAPPER.map(arma, ArmaCriarDTO.class);
    }

    public Arma armaCriarDTOToArma(ArmaCriarDTO armaCriarDTO) {
        return  MODEL_MAPPER.map(armaCriarDTO,Arma.class);
    }

    public Arma ArmaGerirDTO(ArmaGerirDTO armaGerirDTO) {
        return  MODEL_MAPPER.map(armaGerirDTO,Arma.class);
    }

    public List<ArmaListarDTO> toArmaListarDTOList(List<Arma> armas) {
        List<ArmaListarDTO> armaListarDTOS = armas.stream().map(arma -> new
                ArmaListarDTO(arma)).collect(Collectors.toList());
        return armaListarDTOS;
    }


}
