package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.VentaDataStore;
import com.dgd.electricidadChispas.domain.models.Venta;

public class AnadirVentaUseCase {

    private VentaDataStore ventaDataStore;

    public AnadirVentaUseCase(VentaDataStore ventaDataStore) {
        this.ventaDataStore = ventaDataStore;
    }

    public void execute(Venta venta) {
        ventaDataStore.anadirVenta(venta);
    }
}
