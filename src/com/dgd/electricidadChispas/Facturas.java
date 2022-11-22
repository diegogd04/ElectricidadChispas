package com.dgd.electricidadChispas;

public class Facturas {

    private Integer codigoFactura;
    private String fecha;
    private Integer baseImponible;
    private Integer total;

    public Integer getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Integer baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
