package com.dgd.electricidadChispas;

public class Servicios implements Venta{

    private Integer codigoServicio;
    private String nombre;
    private Integer precio;
    private Integer tipoIva;

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer getPrecio() {
        return null;
    }

    @Override
    public void setPrecio(Integer precio) {

    }

    @Override
    public Integer getTipoIva() {
        return null;
    }

    @Override
    public void setTipoIva(Integer tipoIva) {

    }
}
