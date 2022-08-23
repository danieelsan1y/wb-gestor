package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ClienteMapper;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.dto.ClienteCriarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ClienteListarDTO;
import br.com.dagosolutions.WBGestor.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<ClienteListarDTO>> listarTodos() {
        List<Cliente> clientes = clienteService.listarTodos();
        List<ClienteListarDTO> clienteListarDTOS = clienteMapper.toClienteListarDTOList(clientes);
        return  ResponseEntity.ok().body(clienteListarDTOS);

    }

    @GetMapping("{id}")
    ResponseEntity<ClienteListarDTO> buscarPorId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarPorId(id);
        ClienteListarDTO clienteListarDTO = clienteMapper.toCLienteListarDTO(cliente);
        return ResponseEntity.ok().body(clienteListarDTO);
    }

    @PutMapping("{id}")
    ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody ClienteCriarDTO clienteCriarDTO) {
        Cliente cliente = clienteMapper.clienteCriarDTOToCliente(clienteCriarDTO);
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok().build();
    }
    @PutMapping("status/{id}")
    public ResponseEntity<Void> alterarSituacao (@RequestBody String status, @PathVariable Long id ) {
        clienteService.alterarSituacao(status, id);
       return  ResponseEntity.ok().build();
    }


}
