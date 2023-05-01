package org.example;
/**
 * <br>
 * Clase abstracta que sirve para representar una Promocion
 */
public abstract class Promocion {

	/**
     * Metodo que se encarga de aplicar la promocion correspondiente.
     * <b>Pre:</b> promocionable debe ser distinto de null.
     * @param promocionable el objeto al cual se le va a aplicar la promocion.
     */
    public abstract void aplicarPromocion(Promocionable promocionable);
}
