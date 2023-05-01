package org.example;

/**
 * <br>
 * Clase abstracta  que se encarga de la creacion de los objetos de tipo Factura
 */
public abstract class FacturaFactory {

    /**
     * <br>
     * Constructor que sirve para setear la factura.
     */
    public abstract Factura crearFactura(Persona abonado);
}
