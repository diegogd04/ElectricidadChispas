package com.dgd.electricidadChispas.presentation;

import com.dgd.electricidadChispas.domain.models.*;
import com.dgd.electricidadChispas.data.*;
import com.dgd.electricidadChispas.domain.useCase.*;
import java.util.Scanner;
import java.util.List;

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

        ClienteDataStore clienteDataStore = new MemClienteDataStore();

        AnadirClienteUseCase anadirClienteUseCase = new AnadirClienteUseCase(clienteDataStore);
        anadirClienteUseCase.execute(autonomos);
        anadirClienteUseCase.execute(sociedades);

        ObtenerClienteUseCase obtenerClienteUseCase = new ObtenerClienteUseCase(clienteDataStore);
        List<Cliente> clientes = obtenerClienteUseCase.execute();
        for (int i = 0; i < clientes.size(); i++) {
            printCliente(clientes.get(i));
        }

        System.out.println("----- Eliminando ------");

        BorrarClienteUseCase borrarClienteUseCase = new BorrarClienteUseCase(clienteDataStore);
        borrarClienteUseCase.execute(autonomos);
        List<Cliente> clientes2 = obtenerClienteUseCase.execute();
        for (int i = 0; i < clientes2.size(); i++) {
            printCliente(clientes2.get(i));
        }

        System.out.println("----- Modificando la Sociedad ------");

        sociedades.setEmail("alitasPlateadas@gmail.com");
        ModificarClienteUseCase modificarClienteUseCase = new ModificarClienteUseCase(clienteDataStore);
        modificarClienteUseCase.execute(sociedades);
        List<Cliente> clientes3 = obtenerClienteUseCase.execute();
        for (int i = 0; i < clientes3.size(); i++) {
            printCliente(clientes3.get(i));
        }

        Productos productos = new Productos();
        productos.setCodigoProducto(1);
        productos.setNombre("Coche");
        productos.setMarca("Ford");
        productos.setModelo("Focus RS");
        productos.setPrecio(42000);
        productos.setTipoIva(21);

        Productos productos2 = new Productos();
        productos2.setCodigoProducto(2);
        productos2.setNombre("Moto");
        productos2.setMarca("Ducati");
        productos2.setModelo("Panigale V4");
        productos2.setPrecio(26000);
        productos2.setTipoIva(21);

        Servicios servicios = new Servicios();
        servicios.setCodigoServicio(1);
        servicios.setNombre("Limpieza");
        servicios.setPrecio(50);
        servicios.setTipoIva(21);

        Servicios servicios2 = new Servicios();
        servicios2.setCodigoServicio(2);
        servicios2.setNombre("Mantenimiento");
        servicios2.setPrecio(200);
        servicios2.setTipoIva(21);

        VentaDataStore ventaDataStore = new MemVentaDataStore();

        AnadirVentaUseCase anadirVentaUseCase = new AnadirVentaUseCase(ventaDataStore);
        anadirVentaUseCase.execute(productos);
        anadirVentaUseCase.execute(servicios);

        ObtenerVentaUseCase obtenerVentaUseCase = new ObtenerVentaUseCase(ventaDataStore);
        List<Venta> ventas = obtenerVentaUseCase.execute();
        for (int i = 0; i < ventas.size(); i++) {
            printVenta(ventas.get(i));
        }

        System.out.println("----- Eliminando ------");

        BorrarVentaUseCase borrarVentaUseCase = new BorrarVentaUseCase(ventaDataStore);
        borrarVentaUseCase.execute(productos);
        List<Venta> ventas2 = obtenerVentaUseCase.execute();
        for (int i = 0; i < ventas2.size(); i++) {
            printVenta(ventas2.get(i));
        }

        System.out.println("----- Modificando el Servicio ------");

        servicios.setPrecio(150);
        ModificarVentaUseCase modificarVentaUseCase = new ModificarVentaUseCase(ventaDataStore);
        modificarVentaUseCase.execute(servicios);
        List<Venta> ventas3 = obtenerVentaUseCase.execute();
        for (int i = 0; i < ventas3.size(); i++) {
            printVenta(ventas3.get(i));
        }

        Facturas facturas = new Facturas();
        facturas.setCodigoFactura(1);
        facturas.setFecha("08/11/2022");
        facturas.setCliente(facturas.getCliente());
        facturas.setVenta(facturas.getVenta());
        facturas.setBaseImponible(42000 + 50);
        facturas.setTotal(((42000 * 21) / 100) + ((50 * 21) / 100));

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
    public static void printCliente(Cliente cliente) {
        System.out.println("Codigo: " + cliente.getCodigoCliente() + " Email: " + cliente.getEmail());
    }
    public static void printVenta(Venta venta) {
        System.out.println("Codigo: " + venta.getCodigoVenta() + " Email: " + venta.getPrecio());
    }
}