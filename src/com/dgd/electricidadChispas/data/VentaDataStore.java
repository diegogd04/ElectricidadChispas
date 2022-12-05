package com.dgd.electricidadChispas.data;

import com.dgd.electricidadChispas.domain.models.Venta;

import java.util.List;

public interface VentaDataStore {

    void anadirVenta(Venta venta);
    void borrarVenta(Venta venta);
    void ModificarVenta(Venta venta);
    List<Venta> ObtenerTodasVentas();
    Venta findById(Integer codigoVenta);
}
