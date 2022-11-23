package com.dgd.electricidadChispas;

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
        return null;
    }

    @Override
    public void setCodigoCliente(Integer codigoCliente) {

    }

    @Override
    public String getDireccionPostal() {
        return null;
    }

    @Override
    public void setDireccionPostal(String direccionPostal) {

    }

    @Override
    public String getPoblacion() {
        return null;
    }

    @Override
    public void setPoblacion(String poblacion) {

    }

    @Override
    public String getProvincia() {
        return null;
    }

    @Override
    public void setProvincia(String provincia) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getTelefono() {
        return null;
    }

    @Override
    public void setTelefono(String telefono) {

    }
}