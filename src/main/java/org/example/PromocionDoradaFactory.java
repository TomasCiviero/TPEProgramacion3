package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de las promociones doradas
 * En esta clase va toda la logica de la creacion
 */
public class PromocionDoradaFactory extends PromocionFactory {
    /**
     * Constructor que crea la promocion dorada
     */
    @Override
    public Promocion crearPromocion() {
        return new PromocionDorada();
    }
}
