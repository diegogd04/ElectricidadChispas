package com.dgd.electricidadChispas.data;

import com.dgd.electricidadChispas.domain.models.Cliente;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MemClienteDataStore implements ClienteDataStore{

    private TreeMap<Integer, Cliente> dataStore = new TreeMap<>();
    @Override
    public void anadirCliente(Cliente cliente) {
        dataStore.put(cliente.getCodigoCliente(), cliente);
    }

    @Override
    public void borrarCliente(Cliente cliente) {
        dataStore.remove(cliente.getCodigoCliente());
    }

    @Override
    public void ModificarCliente(Cliente cliente) {
        dataStore.replace(cliente.getCodigoCliente(), cliente);
    }

    @Override
    public List<Cliente> ObtenerTodosClientes() {
        return dataStore.values().stream().collect(Collectors.toList());
    }

    @Override
    public Cliente findById(Integer codigoCliente) {
        return dataStore.get(codigoCliente);
    }

}
