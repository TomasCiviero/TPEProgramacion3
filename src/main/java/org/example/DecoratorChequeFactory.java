package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de los Decorator de tipo de pago cheque.
 * En esta clase va toda la logica de la creacion
 */
public class DecoratorChequeFactory extends DecoratorMetodoDePagoFactory{

    /**
     * Constructor que crea el Decorator metodos de pago en cheque
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    @Override
    public DecoratorMetodosDePago crearDecoratorMetodoDepago(IFactura encapsulado) {
        return new DecoratorCheque(encapsulado);
    }
}
