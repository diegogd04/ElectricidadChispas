package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.ClienteDataStore;
import com.dgd.electricidadChispas.domain.models.Cliente;

public class ModificarClienteUseCase {

    private ClienteDataStore clienteDataStore;

    public ModificarClienteUseCase(ClienteDataStore clienteDataStore) {
        this.clienteDataStore = clienteDataStore;
    }

    public void execute(Cliente cliente) {
        clienteDataStore.modificarCliente(cliente);
    }
}
