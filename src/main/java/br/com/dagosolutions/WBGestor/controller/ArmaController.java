package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ArmaMapper;
import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.dto.*;
import br.com.dagosolutions.WBGestor.service.ArmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
    ResponseEntity<Object> listarTodos() {
        List<Arma> armasCompletas= armaService.listarTodosCompletos();
        List<Arma> armasComClienteNuloDataNula= armaService.listarbuscarArmasComClienteNuloDataNula();
        List<Arma> armasComDataNula= armaService.listarComDataNula();

        List<ArmaListarNaoNulosDTO> armasCompletasDTO=
                armaMapper.toArmaArmaListarNaoNulosDTOList(armasCompletas);
        List<ArmaListarDataSaidaNuloClienteNuloDTO> armasComClienteNuloDataNulaDTO=
                armaMapper.toArmaListarDataSaidaNuloClienteNuloDTOList(armasComClienteNuloDataNula);
        List<ArmaListarDataNulaDTO> armasComDataNulaDTO=
                armaMapper.toArmaListarDataNulaDTOList(armasComDataNula);


        Set<ArmaListarNaoNulosDTO> todasArmas = new LinkedHashSet<>();
        todasArmas.addAll(armasCompletasDTO);
        todasArmas.addAll(armasComClienteNuloDataNulaDTO);
        todasArmas.addAll(armasComDataNulaDTO);
        return ResponseEntity.ok().body(todasArmas);
    }

}
