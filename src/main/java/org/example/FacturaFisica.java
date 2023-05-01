package org.example;

import java.util.ArrayList;

/**
 * <br>
 * Clase que calcula el valor final de todas las contrataciones 
 * de una persona fisica
 */
public class FacturaFisica extends Factura {

    //Constructor

    /**
     * <br>
     * Constructor que se encarga de setear la factura fisica
     * <b>Pre:</b> abonado distinto de null
     * @param abonado Persona fisica la cual la Empresa le da una factura
     */
    public FacturaFisica(Persona abonado){
        super(abonado);
    }

    /**
     * Metodo sobreescrito que sirve para calcular la factura final 
     * sumando todas las contrataciones.
     * @return El valor total de las contrataciones para una 
     * persona fisica
     */
    @Override
    public double calcular() {
        double suma = 0;
        for(int i = 0; i <super.getContrataciones().size(); ++i){
            suma += super.getContrataciones().get(i).getTotal();
        }
        return suma;
    }

    /**
     * Metodo sobreescrito de la clase object, que clona una Factura Fisica
     * @return La referencia a la factura fisica clonada.
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        FacturaFisica clonFacturaFisica = (FacturaFisica) super.clone();
        PersonaFisica clonPersonaFisica = (PersonaFisica)clonFacturaFisica.getAbonado();
        clonFacturaFisica.setAbonado((PersonaFisica) clonPersonaFisica.clone());
        ArrayList<Contratacion> clonContrataciones = (ArrayList<Contratacion>) clonFacturaFisica.getContrataciones().clone();
        clonContrataciones.clear();

        for(int i = 0; i < clonContrataciones.size(); ++i){
            Contratacion clonContratacion = (Contratacion) clonFacturaFisica.getContrataciones().get(i).clone();
            clonContrataciones.add(clonContratacion);
        }

        clonFacturaFisica.setContrataciones(clonContrataciones);
        return clonFacturaFisica;
    }
}
