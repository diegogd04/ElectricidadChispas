package com.dgd.electricidadChispas.domain.useCase;

import com.dgd.electricidadChispas.data.VentaDataStore;
import com.dgd.electricidadChispas.domain.models.Venta;

import java.util.List;

public class ObtenerVentaUseCase {

    private VentaDataStore ventaDataStore;

    public ObtenerVentaUseCase(VentaDataStore ventaDataStore){
        this.ventaDataStore = ventaDataStore;
    }

    public List<Venta> execute(){
        return VentaDataStore.ObtenerTodasVentas();
    }
}
