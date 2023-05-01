package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de las factura fisica
 * En esta clase va toda la logica de la creacion
 */
public class FacturaFisicaFactory extends FacturaFactory{

    /**
     * Constructor que crea la factura fisica
     * <b>Pre:</b>  El abonado tiene que ser distinto de null.
     * @param abonado Persona fisica la cual la Empresa le da una factura
     */
    @Override
    public Factura crearFactura(Persona abonado) {
        return new FacturaFisica(abonado);
    }
}
