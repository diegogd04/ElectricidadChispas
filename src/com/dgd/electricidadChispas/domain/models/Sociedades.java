package com.dgd.electricidadChispas.domain.models;

public class Sociedades implements Cliente{

    private Integer codigoCliente;
    private String razonSocial;
    private String cif;
    private String direccionPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String getDireccionPostal() {
        return direccionPostal;
    }

    @Override
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}