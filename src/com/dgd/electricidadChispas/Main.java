package com.dgd.electricidadChispas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String cliente;

        System.out.println("Iniciando...");

        Autonomos autonomos = new Autonomos();
        autonomos.setCodigoCliente(1);
        autonomos.setNombre("Alberto");
        autonomos.setApellidos("Jimenez Garzon");
        autonomos.setDni("86356254J");
        autonomos.setDireccionPostal("Juan Carlos II , Nº7 2ºA");
        autonomos.setPoblacion("Segovia");
        autonomos.setProvincia("Segovia");
        autonomos.setEmail("albertoJimenezGarzon@gmail.com");
        autonomos.setTelefono("623832654");

        Sociedades sociedades = new Sociedades();
        sociedades.setCodigoCliente(2);
        sociedades.setRazonSocial("Alitas Doradas S.L.");
        sociedades.setCif("56789352H");
        sociedades.setDireccionPostal("Juan Grande Nº4");
        sociedades.setPoblacion("Valladolid");
        sociedades.setProvincia("Valladolid");
        sociedades.setEmail("alitasDoradas@gmail.com");
        sociedades.setTelefono("952768235");

        Productos productos = new Productos();
        productos.setCodigoProducto(1);
        productos.setNombre("Coche");
        productos.setMarca("Ford");
        productos.setModelo("Focus RS");
        productos.setPrecio(42000);
        productos.setTipoIva(21);

        productos.setCodigoProducto(2);
        productos.setNombre("Moto");
        productos.setMarca("Ducati");
        productos.setModelo("Panigale V4");
        productos.setPrecio(26000);
        productos.setTipoIva(21);

        Servicios servicios = new Servicios();
        servicios.setCodigoServicio(1);
        servicios.setNombre("Limpieza");
        servicios.setPrecio(50);
        servicios.setTipoIva(21);

        servicios.setCodigoServicio(2);
        servicios.setNombre("Mantenimiento");
        servicios.setPrecio(200);
        servicios.setTipoIva(21);

        Facturas facturas = new Facturas();
        facturas.setCodigoFactura(1);
        facturas.setFecha("08/11/2022");
        facturas.setCliente(facturas.getCliente());
        facturas.setVenta(facturas.getVenta());
        facturas.setBaseImponible(productos.getPrecio() + servicios.getPrecio());
        facturas.setTotal(((productos.getPrecio() * productos.getTipoIva()) / 100) + ((servicios.getPrecio() * servicios.getTipoIva()) / 100));

        //Impresion de factura.

        System.out.println("Introduzca el tipo de cliente (autonomo o sociedad):");
        cliente = entrada.nextLine();
        switch (cliente) {
            case "autonomo":
                System.out.println("Factura: " + facturas.getCodigoFactura() + " | " + facturas.getFecha());
                System.out.println("Cliente: " + autonomos.getDni() + " | " + autonomos.getNombre() + " | " + autonomos.getApellidos() + " | " + autonomos.getDireccionPostal() + " | " + autonomos.getPoblacion() + " | " + autonomos.getProvincia() + " | " + autonomos.getEmail());
                System.out.println("Linea venta " + productos.getNombre() + ": " + productos.getCodigoProducto() + " | " + productos.getNombre() + " | " + productos.getPrecio() + " | " + productos.getTipoIva() + " | " + ((productos.getPrecio() * productos.getTipoIva()) / 100));
                System.out.println("Linea venta " + servicios.getNombre() + ": " + servicios.getCodigoServicio() + " | " + servicios.getNombre() + " | " + servicios.getPrecio() + " | " + servicios.getTipoIva() + " | " + ((servicios.getPrecio() * servicios.getTipoIva()) / 100));
                System.out.println("Total: Total " + ((productos.getPrecio() * productos.getTipoIva()) / 100) + ((servicios.getPrecio() * servicios.getTipoIva()) / 100));
                break;
            case "sociedad":
                System.out.println("Factura: " + facturas.getCodigoFactura() + " | " + facturas.getFecha());
                System.out.println("Cliente: " + sociedades.getCif() + " | " + sociedades.getRazonSocial() + " | " + sociedades.getDireccionPostal() + " | " + sociedades.getPoblacion() + " | " + sociedades.getProvincia() + " | " + sociedades.getEmail());
                System.out.println("Linea venta " + productos.getNombre() + ": " + productos.getCodigoProducto() + " | " + productos.getNombre() + " | " + productos.getPrecio() + " | " + productos.getTipoIva() + " | " + ((productos.getPrecio() * productos.getTipoIva()) / 100));
                System.out.println("Linea venta " + servicios.getNombre() + ": " + servicios.getCodigoServicio() + " | " + servicios.getNombre() + " | " + servicios.getPrecio() + " | " + servicios.getTipoIva() + " | " + ((servicios.getPrecio() * servicios.getTipoIva()) / 100));
                System.out.println("Total: Total " + ((productos.getPrecio() * productos.getTipoIva()) / 100) + ((servicios.getPrecio() * servicios.getTipoIva()) / 100));
                break;
        }
    }
}