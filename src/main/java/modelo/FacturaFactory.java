package modelo;

/**
 * <br>
 * Clase abstracta  que se encarga de la creacion de los objetos de tipo Factura
 */
public class FacturaFactory {

    /**
     * <br>
     * Constructor que sirve para setear la factura.
     */

    public FacturaFactory(){

    }
    public Factura crearFactura(String tipoFactura) {
        if(tipoFactura.equals("Jurídica")){
            return new FacturaJuridica();
        }
        else if(tipoFactura.equals("Física")){
            return new FacturaFisica();
        }
        return null;
    }
}
