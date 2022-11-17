package com.dgd.electricidadChispas;

public class Servicios {

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

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(Integer tipoIva) {
        this.tipoIva = tipoIva;
    }
}
