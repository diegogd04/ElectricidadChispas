package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.VentaDataStore;
import com.dgd.electricidadChispas.domain.models.Venta;

public class BorrarVentaUseCase {

    private VentaDataStore ventaDataStore;

    public BorrarVentaUseCase(VentaDataStore ventaDataStore){
        this.ventaDataStore = ventaDataStore;
    }

    public void execute(Venta venta){
        ventaDataStore.borrarVenta(venta);
    }

}
