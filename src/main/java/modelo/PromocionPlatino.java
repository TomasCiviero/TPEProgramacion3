package modelo;
/**
 * <br>
 * Clase que sirve para calcular la promocion platino
 */
public class PromocionPlatino extends Promocion {


    /**
     * Metodo que se encarga de aplicar la promocion platino.
     * <b>Pre:</b> promocionable debe ser distinto de null.
     * @param promocionable el objeto al cual se le va a aplicar la promocion.
     */


    @Override
    public void aplicarPromocion(Promocionable promocionable) {
        promocionable.aplicarPromocionPlatino();
    }
    public PromocionPlatino(){

    }
}
