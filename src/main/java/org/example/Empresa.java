package org.example;

import java.util.ArrayList;

/**
 * <br>
 * Clase que representa a una Empresa de contrataciones
 * Contiene los metodos de la empresa.
 */
public class Empresa {
    private static Empresa instance;
    private String nombre;
    private ArrayList<Persona> listaClientes = new ArrayList<Persona>();
    private ArrayList<Factura> listaFactura = new ArrayList<Factura>();
    private ArrayList<Domicilio> listaDomicilios = new ArrayList<Domicilio>();
    private Promocion promocion;

    /**
     * Constructor privado para que solo se pueda usar dentro de la clase
     */
    //Constructor privado
    private Empresa(){

    }

    //Singleton
    /**
     * Metodo utilizado para que solo haya una instancia en toda la clase.
     */
    public static Empresa getInstance(){
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }

    //Getters
    public Promocion getPromocion() {
        return promocion;
    }

    public ArrayList<Domicilio> getListaDomicilios() {
        return listaDomicilios;
    }

    public ArrayList<Factura> getListaFactura() {
        return listaFactura;
    }

    public ArrayList<Persona> getListaClientes() {
        return listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos

    /**
     * Metodo que agrega domicilios a los arrays
     * <b>Pre:</b> domicilio debe ser distinto de null
     * @param domicilio domicilio a agregar a la lista de domicilios
     */
    public void agregarDomicilio(Domicilio domicilio) {
        listaDomicilios.add(domicilio);
    }

    /**
     * Metodo que agrega factura al array
     * <b>Pre:</b> factura debes er distinto de null
     * @param factura facturaa agregar a la lista de facturas
     */
    public void agregarFactura(Factura factura) {
        listaFactura.add(factura);
    }

    /**
     * Metodo que agrega clientes al array de clientes.
     * <b>Pre:</b> cliente debe ser distinto de null
     * @param cliente cliente a agregar a la lista de clientes
     */
    public void agregarCliente(Persona cliente) {
        listaClientes.add(cliente);
    }


}
