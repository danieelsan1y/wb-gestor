package br.com.dagosolutions.WBGestor.service;

import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.enums.StatusCliente;
import br.com.dagosolutions.WBGestor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void criar (Cliente cliente) {
        cliente.setStatusCliente(StatusCliente.ATIVO);
        clienteRepository.save(cliente);
    }
}
