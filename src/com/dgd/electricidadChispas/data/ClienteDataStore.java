package com.dgd.electricidadChispas.data;

import com.dgd.electricidadChispas.domain.models.Cliente;
import java.util.List;

public interface ClienteDataStore {

    void anadirCliente(Cliente cliente);
    void borrarCliente(Cliente cliente);
    void modificarCliente(Cliente cliente);
    List<Cliente> ObtenerTodosClientes();
    Cliente findById(Integer codigoCliente);
}
