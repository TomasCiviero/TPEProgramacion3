package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de los Decorator de tipo Metodo De pago.
 */
public abstract class DecoratorMetodoDePagoFactory {

    /**
     * Constructor que crea el Decorator de tipo Metodo de pago
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    public abstract DecoratorMetodosDePago crearDecoratorMetodoDepago(IFactura encapsulado);
}
