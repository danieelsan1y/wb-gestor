package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ModeloArmaMapper;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.dto.ClienteCriarDTO;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaListarDTO;
import br.com.dagosolutions.WBGestor.service.ModeloArmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modeloarma")
public class ModeloArmaController {

    @Autowired
    ModeloArmaService modeloArmaService;

    @Autowired
    ModeloArmaMapper modeloArmaMapper;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody ModeloArmaDTO modeloArmaDTO) {
        ModeloArma modeloArma = modeloArmaMapper.toModeloArma(modeloArmaDTO);
        modeloArmaService.criar(modeloArma);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<ModeloArmaListarDTO>> listarTodos() {
        List<ModeloArma> modeloArmas = modeloArmaService.listarTodos();
        List<ModeloArmaListarDTO> modeloArmaListarDTOS = modeloArmaMapper.toModeloArmaListarDTOList(modeloArmas);
        return ResponseEntity.ok().body(modeloArmaListarDTOS);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody ModeloArmaDTO modeloArmaDTO) {
        ModeloArma modeloArma = modeloArmaMapper.toModeloArma(modeloArmaDTO);
        modeloArmaService.atualizar(id, modeloArma);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModeloArmaListarDTO> buscarPorId(@PathVariable Long id) {

        ModeloArma modeloArma = modeloArmaService.buscarPorId(id);
        ModeloArmaListarDTO modeloArmaListarDTO = modeloArmaMapper.toModeloArmaListarDTO(modeloArma);
        return ResponseEntity.ok().body(modeloArmaListarDTO);
    }


}
