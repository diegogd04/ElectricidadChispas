package com.dgd.electricidadChispas.domain.models;

public class Productos implements Venta{

    private Integer codigoVenta;
    private Integer codigoProducto;
    private String nombre;
    private String marca;
    private String modelo;
    private Integer precio;
    private Integer tipoIva;

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public Integer getCodigoVenta() {
        return null;
    }

    @Override
    public void setCodigoVenta(Integer codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    @Override
    public Integer getPrecio() {
        return null;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getTipoIva() {
        return null;
    }

    @Override
    public void setTipoIva(Integer tipoIva) {
        this.tipoIva = tipoIva;
    }
}
