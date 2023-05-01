package org.example;

import java.util.*;
/**
 * <br>
 * Clase abstracta que sirve para representar los datos de una 
 * Persona tanto fisica como jurdiica.
 */
public abstract class Persona implements Cloneable{

    private ArrayList<Domicilio> domicilios=new ArrayList<Domicilio>();

    //Getter

    public ArrayList<Domicilio> getDomicilios() {
        return domicilios;
    }

    /**
     * Metodo que agrega domicilio al array
     * <b>Pre:</b> domicilio debe ser distinto de null
     * @param domicilio domicilio a agregar a la lista de domicilios
     */
    public void agregarDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }

}
