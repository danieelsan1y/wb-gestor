package br.com.dagosolutions.WBGestor.controller.mapper;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.dto.ArmaCriarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ClienteCriarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    private static  final ModelMapper MODEL_MAPPER = new ModelMapper();

    public ClienteCriarDTO toCLienteCriarDTO(Cliente cliente) {
        return MODEL_MAPPER.map(cliente, ClienteCriarDTO.class);
    }

    public Cliente clienteCriarDTOToCliente(ClienteCriarDTO clienteCriarDTO) {
        return  MODEL_MAPPER.map(clienteCriarDTO,Cliente.class);
    }


}
