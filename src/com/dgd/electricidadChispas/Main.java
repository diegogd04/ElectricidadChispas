package com.dgd.electricidadChispas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando...");

        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        String opcion;

        while (!salir){
            System.out.println("¿Que quiere introducir? (autonomo, sociedad, producto, servicio, factura o salir)");
            opcion = entrada.nextLine();
            System.out.println ("");

            switch (opcion) {
                case "autonomo":
                    System.out.println("~INTRODUCE UN AUTONOMO~");
                    System.out.println("------------------------");

                    String nombreAutonomo, apellidosAutonomo, dniAutonomo, direccionPostalAutonomo, poblacionAutonomo, provinciaAutonomo, emailAutonomo, telefonoAutonomo;

                    Autonomos autonomos = new Autonomos();
                    autonomos.setCodigoCliente(1);
                    System.out.println("Introduce el nombre:");
                    autonomos.setNombre(nombreAutonomo = entrada.nextLine());
                    System.out.println("Introduce los apellidos:");
                    autonomos.setApellidos(apellidosAutonomo = entrada.nextLine());
                    System.out.println("Introduce el dni:");
                    autonomos.setDni(dniAutonomo = entrada.nextLine());
                    System.out.println("Introduce la direccionPostal:");
                    autonomos.setDireccionPostal(direccionPostalAutonomo = entrada.nextLine());
                    System.out.println("Introduce la poblacion:");
                    autonomos.setPoblacion(poblacionAutonomo = entrada.nextLine());
                    System.out.println("Introduce la provincia:");
                    autonomos.setProvincia(provinciaAutonomo = entrada.nextLine());
                    System.out.println("Introduce el email:");
                    autonomos.setEmail(emailAutonomo = entrada.nextLine());
                    System.out.println("Introduce el telefono:");
                    autonomos.setTelefono(telefonoAutonomo = entrada.nextLine());
                    System.out.println("~AUTONOMO INTRODUCIDO~");
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("");
                    break;
                case "sociedad":
                    System.out.println("~INTRODUCE UNA SOCIEDAD~");
                    System.out.println("------------------------");

                    String razonSocialSociedad, cifSociedad, direccionPostalSociedad, poblacionSociedad, provinciaSociedad, emailSociedad, telefonoSociedad;

                    Sociedades sociedades = new Sociedades();
                    sociedades.setCodigoCliente(1);
                    System.out.println("Introduce la razon social:");
                    sociedades.setRazonSocial(razonSocialSociedad = entrada.nextLine());
                    System.out.println("Introduce el cif:");
                    sociedades.setCif(cifSociedad = entrada.nextLine());
                    System.out.println("Introduce la direccion postal:");
                    sociedades.setDireccionPostal(direccionPostalSociedad = entrada.nextLine());
                    System.out.println("Introduce la poblacion:");
                    sociedades.setPoblacion(poblacionSociedad = entrada.nextLine());
                    System.out.println("Introduce la provincia:");
                    sociedades.setProvincia(provinciaSociedad = entrada.nextLine());
                    System.out.println("Introduce el email:");
                    sociedades.setEmail(emailSociedad = entrada.nextLine());
                    System.out.println("Introduce el telefono:");
                    sociedades.setTelefono(telefonoSociedad = entrada.nextLine());
                    System.out.println("~SOCIEDAD INTRODUCIDA~");
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("");
                    break;
                case "producto":
                    System.out.println("~INTRODUCE UN PRODUCTO~");
                    System.out.println("-----------------------");

                    String nombreProducto, marcaProducto, modeloProducto;
                    Integer precioProducto, tipoIvaProducto;

                    Productos productos = new Productos();
                    productos.setCodigoProducto(1);
                    System.out.println("Introduce el nombre:");
                    productos.setNombre(nombreProducto = entrada.nextLine());
                    System.out.println("Introduce la marca:");
                    productos.setMarca(marcaProducto = entrada.nextLine());
                    System.out.println("Introduce el modelo:");
                    productos.setModelo(modeloProducto = entrada.nextLine());
                    System.out.println("Introduce el precio:");
                    productos.setPrecio(precioProducto = entrada.nextInt());
                    System.out.println("Introduce el tipo de iva: (0, 4, 10 o 21)");
                    tipoIvaProducto = entrada.nextInt();
                    switch (tipoIvaProducto){
                        case 0:
                            productos.setTipoIva(tipoIvaProducto = entrada.nextInt());
                            break;
                        case 4:
                            productos.setTipoIva(tipoIvaProducto = entrada.nextInt());
                            break;
                        case 10:
                            productos.setTipoIva(tipoIvaProducto = entrada.nextInt());
                            break;
                        case 21:
                            productos.setTipoIva(tipoIvaProducto = entrada.nextInt());
                            break;
                        default:
                            System.out.println("Error: el tipo de iva introducido no es correcto. Introduce uno de los siguientes: 0, 4, 10 o 21.");
                            tipoIvaProducto = entrada.nextInt();
                    }
                    System.out.println("~PRODUCTO INTRODUCIDO~");
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("");
                    break;
                case "servicio":
                    System.out.println("~INTRODUCE UN SERVICIO~");
                    System.out.println("-----------------------");

                    String nombreServicio;
                    Integer precioServicio, tipoIvaServicio;

                    Servicios servicios = new Servicios();
                    servicios.setCodigoServicio(1);
                    System.out.println("Introduce el nombre:");
                    servicios.setNombre(nombreServicio = entrada.nextLine());
                    System.out.println("Introduce el precio:");
                    servicios.setPrecio(precioServicio = entrada.nextInt());
                    System.out.println("Introduce el tipo de iva:  (0, 4, 10 o 21)");
                    tipoIvaServicio = entrada.nextInt();
                    switch (tipoIvaServicio) {
                        case 0:
                            servicios.setTipoIva(tipoIvaServicio = entrada.nextInt());
                            break;
                        case 4:
                            servicios.setTipoIva(tipoIvaServicio = entrada.nextInt());
                            break;
                        case 10:
                            servicios.setTipoIva(tipoIvaServicio = entrada.nextInt());
                            break;
                        case 21:
                            servicios.setTipoIva(tipoIvaServicio = entrada.nextInt());
                            break;
                        default:
                            System.out.println("Error: el tipo de iva introducido no es correcto. Introduce uno de los siguientes: 0, 4, 10 o 21.");
                            tipoIvaServicio = entrada.nextInt();
                    }
                    System.out.println("~SERVICIO INTRODUCIDO~");
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("");
                    break;
                case "factura":
                    System.out.println("~INTRODUCE UNA FACTURA~");
                    System.out.println("-----------------------");

                    String fechaFactura;
                    Integer baseImponibleFactura, totalFactura;

                    Facturas facturas = new Facturas();
                    facturas.setCodigoFactura(1);
                    System.out.println("Introduce un cliente:");

                    System.out.println("Introduce una venta:");

                    System.out.println("Introduce la fecha:");
                    facturas.setFecha(fechaFactura = entrada.nextLine());
                    System.out.println("Obteniendo la base imponible...");
                    //facturas.setBaseImponible();
                    System.out.println("");
                    System.out.println("Obteniendo el total de la factura...");
                    //facturas.setTotal();
                    System.out.println("");
                    System.out.println("~FACTURA INTRODUCIDA~");
                    System.out.println("----------------------");
                    System.out.println("----------------------");
                    System.out.println("");
                    break;
                case "salir":
                    salir = true;
                    break;
            }
        }
    }
}