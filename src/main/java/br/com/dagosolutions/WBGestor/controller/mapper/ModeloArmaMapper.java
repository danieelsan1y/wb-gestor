package br.com.dagosolutions.WBGestor.controller.mapper;

import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModeloArmaMapper {
    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ModeloArmaDTO toModeloArmaCriarDTO(ModeloArma modeloArma) {
        return MODEL_MAPPER.map(modeloArma, ModeloArmaDTO.class);
    }

    public ModeloArma toModeloArma(ModeloArmaDTO modeloArmaDTO) {
        return  MODEL_MAPPER.map(modeloArmaDTO,ModeloArma.class);
    }

    public List<ModeloArmaDTO> toParkingDTOList(List<ModeloArma> modeloArmas) {
        List<ModeloArmaDTO> modeloArmaDTOS = modeloArmas.stream().map(modeloArma -> new
                ModeloArmaDTO(modeloArma)).collect(Collectors.toList());
        return modeloArmaDTOS;
    }

}
