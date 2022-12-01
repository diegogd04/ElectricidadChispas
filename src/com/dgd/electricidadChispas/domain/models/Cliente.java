package com.dgd.electricidadChispas.domain.models;

public interface Cliente {

    public Integer getCodigoCliente();
    public void setCodigoCliente(Integer codigoCliente);
    public String getDireccionPostal();
    public void setDireccionPostal(String direccionPostal);
    public String getPoblacion();
    public void setPoblacion(String poblacion);
    public String getProvincia();
    public void setProvincia(String provincia);
    public String getEmail();
    public void setEmail(String email);
    public String getTelefono();
    public void setTelefono(String telefono);
}
