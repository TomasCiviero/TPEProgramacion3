package org.example;

/**
 * <br>
 * Clase que representa el domicilio de una contratacion 
 * o de una persona.
 */
public class Domicilio implements Cloneable {

    private String calle;
    private int numero;

    //Constructor
    /**
     * Constructor con dos parametros para setear el domicilio
     * <b>Pre:</b> la calle tiene que ser distinta de "" y de null.
     * Y el numero tiene que ser mayor que cero.
     *
     * @param calle Calle en la que esta ubicado el domicilio
     * @param numero numero de la calle en la que esta ubicado el domicilio
     */
    public Domicilio(String calle, int numero){
        this.calle = calle;
        this.numero = numero;
    }

    //Getters
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Metodo sobreescrito de la clase object, que clona un domicilio
     * @return La referencia al domicilio clonado.
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        Domicilio clone = (Domicilio) super.clone();
        return clone;
    }
}
