package com.dgd.electricidadChispas.data;

import com.dgd.electricidadChispas.domain.models.Venta;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MemVentaDataStore implements VentaDataStore{

    private TreeMap<Integer, Venta> dataStore = new TreeMap<>();
    @Override
    public void anadirVenta(Venta venta) {
        dataStore.put(venta.getCodigoVenta(), venta);
    }

    @Override
    public void borrarVenta(Venta venta) {
        dataStore.remove(venta.getCodigoVenta());
    }

    @Override
    public void ModificarVenta(Venta venta) {
        dataStore.replace(venta.getCodigoVenta(), venta);
    }

    @Override
    public List<Venta> ObtenerTodasVentas() {
        return dataStore.values().stream().collect(Collectors.toList());
    }

    @Override
    public Venta findById(Integer codigoVenta) {
        return dataStore.get(codigoVenta);
    }

}
