package br.com.dagosolutions.WBGestor.service;

import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.repository.ModeloArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloArmaService {

    @Autowired
    ModeloArmaRepository modeloArmaRepository;

    public void criar(ModeloArma modeloArma) {

        modeloArmaRepository.save(modeloArma);
    }

    public List<ModeloArma> listarTodos() {
        return modeloArmaRepository.findAll();
    }

    public void atualizar(Long id, ModeloArma modeloArma) {
        ModeloArma modeloArmaAntigo = modeloArmaRepository.findBYId(id);
        atualizarCapos(modeloArmaAntigo, modeloArma);
    }

    private void atualizarCapos(ModeloArma modeloArmaAntigo, ModeloArma modeloArma) {
        modeloArmaAntigo.setModelo(modeloArma.getModelo());
        modeloArmaAntigo.setAlmaArma(modeloArma.getAlmaArma());
        modeloArmaAntigo.setTamanhoArma(modeloArma.getTamanhoArma());
        modeloArmaAntigo.setPreco(modeloArma.getPreco());
        modeloArmaAntigo.setPaisFabricacao(modeloArma.getPaisFabricacao());
        modeloArmaAntigo.setCalibre(modeloArma.getCalibre());
        modeloArmaAntigo.setCapacidade(modeloArma.getCapacidade());
        modeloArmaAntigo.setMarca(modeloArma.getMarca());
        modeloArmaAntigo.setQuantidadeDeCano(modeloArma.getQuantidadeDeCano());
        modeloArmaRepository.save(modeloArmaAntigo);
    }
}
