package br.com.dagosolutions.WBGestor.service;

import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.enums.StatusCliente;
import br.com.dagosolutions.WBGestor.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public void criar (Cliente cliente) {
        cliente.setStatusCliente(StatusCliente.ATIVO);
        clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }


    public Cliente buscarPorId(Long id) {
        return clienteRepository.buscarPorId(id);
    }

    public void atualizar(Long id, Cliente cliente) {
        Cliente clienteAntigo = clienteRepository.buscarPorId(id);
        alterarCampos(clienteAntigo,cliente);
        clienteRepository.save(clienteAntigo);
    }

    private void alterarCampos(Cliente clienteAntigo, Cliente cliente) {
        clienteAntigo.setNome(cliente.getNome());
        clienteAntigo.setStatusCliente(cliente.getStatusCliente());
        clienteAntigo.setCpf(cliente.getCpf());
        clienteAntigo.setDataDeNacimento(cliente.getDataDeNacimento());
        clienteAntigo.setEndereco(cliente.getEndereco());
        clienteAntigo.setTelefone(cliente.getTelefone());
        clienteAntigo.setCr(cliente.getCr());
    }

    public void desativar(Long id) {
        Cliente cliente = clienteRepository.buscarPorId(id);
        cliente.setStatusCliente(StatusCliente.INATIVO);
        clienteRepository.save(cliente);
    }

    public void ativar(Long id) {
        Cliente cliente = clienteRepository.buscarPorId(id);
        cliente.setStatusCliente(StatusCliente.ATIVO);
        clienteRepository.save(cliente);
    }
}
