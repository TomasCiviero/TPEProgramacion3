package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de las factura juridicas
 * En esta clase va toda la logica de la creacion
 */
public class FacturaJuridicaFactory extends FacturaFactory{
    /**
     * Constructor que crea la factura juridica
     * <b>Pre:</b>  El abonado tiene que ser distinto de null.
     * @param abonado Persona juridica la cual la Empresa le da una factura
     */
    @Override
    public Factura crearFactura(Persona abonado) {
        return new FacturaJuridica(abonado);
    }
}
