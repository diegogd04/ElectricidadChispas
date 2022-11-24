package com.dgd.electricidadChispas;

public class Autonomos implements Cliente{

    private Integer codigoCliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccionPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public void setCodigoCliente(Integer codigoCliente) {

    }

    @Override
    public String getDireccionPostal() {
        return direccionPostal;
    }

    @Override
    public void setDireccionPostal(String direccionPostal) {

    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {

    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {

    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {

    }
}