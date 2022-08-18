package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ArmaMapper;
import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.dto.ArmaGerirDTO;
import br.com.dagosolutions.WBGestor.model.dto.ArmaCriarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ArmaListarDTO;
import br.com.dagosolutions.WBGestor.service.ArmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arma")
public class ArmaController {

    @Autowired
    ArmaService armaService;

    @Autowired
    ArmaMapper armaMapper;

    @PostMapping("entrada")
    public ResponseEntity<Void> realizarEntrada (@RequestBody ArmaCriarDTO armaCriarDTO) {
        Arma arma = armaMapper.armaCriarDTOToArma(armaCriarDTO);
        armaService.realizarEntrada(arma, armaCriarDTO.getModeloArma());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("operacoes/{id}")
    public ResponseEntity<Void> gerir (@PathVariable Long id, @RequestBody ArmaGerirDTO armaGerirDTO) {
        Arma arma = armaMapper.ArmaGerirDTO(armaGerirDTO);
        armaService.gerir(id, arma);
        return ResponseEntity.ok().build();
    }

    @PutMapping("saida/{id}")
    public ResponseEntity<Void> realizarSaida(@PathVariable Long id) {
        armaService.realizarSaida(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    ResponseEntity<List<ArmaListarDTO>> listarTodos() {
        List<Arma> armas= armaService.listarTodos();
        List<ArmaListarDTO> armaListarDTOS = armaMapper.toArmaListarDTOList(armas);
        return ResponseEntity.ok().body(armaListarDTOS);
    }

}
