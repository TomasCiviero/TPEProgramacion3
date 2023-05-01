package org.example;
/**
 * <br>
 * Interfaz que añade el comportamiento de calcular una 
 * factura a las clases que la implementen
 */
public interface IFactura extends Cloneable{

	 /**
     * Metodo que sirve para calcular la factura final 
     * sumando todas las contrataciones.
     * @return El valor total de las contrataciones.
     */
    double calcular();

    /**
     * Metodo sobreescrito de la clase object para volverlo publico.
     */
    Object clone() throws CloneNotSupportedException;

}