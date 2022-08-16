package br.com.dagosolutions.WBGestor.controller;

import br.com.dagosolutions.WBGestor.controller.mapper.ModeloArmaMapper;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.dto.ModeloArmaDTO;
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
    public ResponseEntity<List<ModeloArmaDTO>> listarTodos() {
        List<ModeloArma> modeloArmas = modeloArmaService.listarTodos();
        List<ModeloArmaDTO> modeloArmaDTOS = modeloArmaMapper.toParkingDTOList(modeloArmas);
        return ResponseEntity.ok().body(modeloArmaDTOS);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody ModeloArmaDTO modeloArmaDTO) {
        ModeloArma modeloArma = modeloArmaMapper.toModeloArma(modeloArmaDTO);
        modeloArmaService.atualizar(id, modeloArma);
        return ResponseEntity.ok().build();
    }

}
