package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.VentaDataStore;
import com.dgd.electricidadChispas.domain.models.Venta;

public class ModificarVentaUseCase {

    private VentaDataStore ventaDataStore;

    public ModificarVentaUseCase(VentaDataStore ventaDataStore) {
        this.ventaDataStore = ventaDataStore;
    }

    public void execute(Venta venta) {
        ventaDataStore.ModificarVenta(venta);
    }
}
