package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.ClienteDataStore;
import com.dgd.electricidadChispas.domain.models.Cliente;
import java.util.List;

public class ObtenerClienteUseCase {

    private ClienteDataStore clienteDataStore;

    public ObtenerClienteUseCase(ClienteDataStore clienteDataStore){
        this.clienteDataStore = clienteDataStore;
    }

    public List<Cliente> execute(){
        return ClienteDataStore.ObtenerTodosClientes();
    }
}
