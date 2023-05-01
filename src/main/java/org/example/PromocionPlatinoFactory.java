package org.example;
/**
 * <br>
 * Clase que se encarga de la creacion de las promociones platino
 * En esta clase va toda la logica de la creacion
 */
public class PromocionPlatinoFactory extends PromocionFactory{
    /**
     * Constructor que crea la promocion platino
     */
    @Override
    public Promocion crearPromocion() {
        return new PromocionPlatino();
    }
}
