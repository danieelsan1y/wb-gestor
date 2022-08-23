package br.com.dagosolutions.WBGestor.controller.mapper;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.dto.ArmaListarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaListarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModeloArmaMapper {
    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ModeloArmaDTO toModeloArmaDTO(ModeloArma modeloArma) {
        return MODEL_MAPPER.map(modeloArma, ModeloArmaDTO.class);
    }

    public ModeloArmaListarDTO toModeloArmaListarDTO(ModeloArma modeloArma) {
        return MODEL_MAPPER.map(modeloArma, ModeloArmaListarDTO.class);
    }

    public ModeloArma toModeloArma(ModeloArmaDTO modeloArmaDTO) {
        return  MODEL_MAPPER.map(modeloArmaDTO,ModeloArma.class);
    }

    public List<ModeloArmaListarDTO> toModeloArmaListarDTOList(List<ModeloArma> modeloArmas) {
        List<ModeloArmaListarDTO> modeloArmaListarDTOS = modeloArmas.stream().map(modeloArma -> toModeloArmaListarDTO(modeloArma)).collect(Collectors.toList());
        return modeloArmaListarDTOS;
    }

}
