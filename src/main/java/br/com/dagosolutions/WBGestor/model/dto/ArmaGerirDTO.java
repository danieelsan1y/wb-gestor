package br.com.dagosolutions.WBGestor.model.dto;

import br.com.dagosolutions.WBGestor.model.Cliente;
import br.com.dagosolutions.WBGestor.model.enums.StatusArma;

public class ArmaGerirDTO {

    private StatusArma status;
    private ClienteIdDTO cliente;

    public ArmaGerirDTO(StatusArma status, ClienteIdDTO cliente) {
        this.status = status;
        this.cliente = cliente;
    }

    public ArmaGerirDTO(StatusArma status) {
        this.status = status;
    }

    public StatusArma getStatus() {
        return status;
    }

    public void setStatus(StatusArma status) {
        this.status = status;
    }

    public ClienteIdDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteIdDTO cliente) {
        this.cliente = cliente;
    }
}
