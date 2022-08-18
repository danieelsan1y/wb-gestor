package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ClienteMapper;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.dto.ClienteCriarDTO;
import br.com.dagosolutions.WBGestor.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody ClienteCriarDTO clienteCriarDTO) {
        Cliente cliente = clienteMapper.clienteCriarDTOToCliente(clienteCriarDTO);
        clienteService.criar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }




}
