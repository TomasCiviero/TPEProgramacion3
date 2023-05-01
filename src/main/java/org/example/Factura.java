package org.example;

import java.util.*;
/**
 * <br>
 * Clase que representa una factura de una persona fisica o juridica.
 */
public abstract class Factura implements IFactura{
    private final int id;
    private static int sigId = 0;
    private Persona abonado;
    private ArrayList<Contratacion> contrataciones=new ArrayList<Contratacion>();

    /**
     * Constructor con un parametros para setear la factura
     * <b>Pre:</b> abonado distinto de null
     *
     * @param abonado Persona la cual la Empresa le da una factura
     */
    public Factura(Persona abonado){
        this.abonado = abonado;
        this.id=sigId;
        sigId = sigId + 1;
    }

    //Getters
    public ArrayList<Contratacion> getContrataciones() {
        return contrataciones;
    }
    public Persona getAbonado() {
        return abonado;
    }

    //Setters

    public void setContrataciones(ArrayList<Contratacion> contrataciones){
        this.contrataciones = contrataciones;
    }

    public void setAbonado(Persona abonado){
        this.abonado = abonado;
    }

    //Metodos

    /**
     * Metodo que agrega una contratacion a la factura
     * <b>Pre:</b> contratacion debes ser distinto de null
     * @param contratacion contratacion a agregar a la lista de contrataciones
     */
    public void agregarContratacion(Contratacion contratacion){
        contrataciones.add(contratacion);
    }

    /**
     * Metodo sobreescrito de la clase object, que clona una Factura
     * @return La referencia a la factura clonada.
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
