package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.ClienteDataStore;
import com.dgd.electricidadChispas.domain.models.Cliente;

public class AnadirClienteUseCase {

    private ClienteDataStore clienteDataStore;

    public AnadirClienteUseCase(ClienteDataStore clienteDataStore) {
        this.clienteDataStore = clienteDataStore;
    }

    public void execute(Cliente cliente) {
        clienteDataStore.anadirCliente(cliente);
    }
}
