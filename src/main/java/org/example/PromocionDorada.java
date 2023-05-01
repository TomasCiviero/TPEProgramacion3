package org.example;

/**
 * <br>
 * Clase que sirve para calcular la promocion dorada
 */
public class PromocionDorada extends Promocion {
    
	
	/**
     * Metodo que se encarga de aplicar la promocion dorada.
     * <b>Pre:</b> promocionable debe ser distinto de null.
     * @param promocionable el objeto al cual se le va a aplicar la promocion.
     */
	@Override
    public void aplicarPromocion(Promocionable promocionable) {
        promocionable.aplicarPromocionDorada();
    }



}
