package br.com.dagosolutions.WBGestor.service;

import br.com.dagosolutions.WBGestor.model.Arma;
import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.ModeloArma;
import br.com.dagosolutions.WBGestor.model.enums.StatusArma;
import br.com.dagosolutions.WBGestor.repository.ArmaRepository;
import br.com.dagosolutions.WBGestor.repository.ClienteRepository;
import br.com.dagosolutions.WBGestor.repository.ModeloArmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ArmaService {

    @Autowired
    ArmaRepository armaRepository;

    @Autowired
    ModeloArmaRepository modeloArmaRepository;

    @Autowired
    ClienteRepository clienteRepository;

    public void realizarEntrada(Arma arma, Long id) {
        ModeloArma modeloArma = modeloArmaRepository.buscarPorId(id);
        arma.setModeloArma(modeloArma);
        arma.setDataEntrada(LocalDate.now());
        arma.setStatus(StatusArma.DISPONIVEL);
        armaRepository.save(arma);
    }

    public void gerir(Long id, Arma arma) {
        Arma armaAntiga = armaRepository.buscarPorId(id);
        armaAntiga.setStatus(arma.getStatus());
        Cliente cliente = clienteRepository.buscarPorId(arma.getCliente().getId());
        armaAntiga.setCliente(cliente);
        armaRepository.save(armaAntiga);
    }
    public void realizarSaida(Long id) {
        Arma arma = armaRepository.buscarPorId(id);
        arma.setStatus(StatusArma.VENDIDO_E_RETIRADO);
        arma.setDataSaida(LocalDate.now());
        armaRepository.save(arma);
    }
    public List<Arma> buscarTodas() {
        return armaRepository.findAll();
    }

    public Arma buscarPorId(Long id) {
        return armaRepository.buscarPorId(id);
    }
}
