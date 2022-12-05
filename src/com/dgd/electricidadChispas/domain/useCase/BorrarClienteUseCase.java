package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.ClienteDataStore;
import com.dgd.electricidadChispas.domain.models.Cliente;

public class BorrarClienteUseCase {

    private ClienteDataStore clienteDataStore;

    public BorrarClienteUseCase(ClienteDataStore clienteDataStore){
        this.clienteDataStore = clienteDataStore;
    }

    public void execute(Cliente cliente){
        clienteDataStore.borrarCliente(cliente);
    }

}
