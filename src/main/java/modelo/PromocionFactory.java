package modelo;

/**
 * <br>
 * Clase abstracta que se encarga de la creacion de las promociones en general.
 */
public class PromocionFactory {
    /**
     * Constructor que crea la promocion
     */

    public  Promocion crearPromocion(String tipoPromocion){
        if(tipoPromocion.equals("Platino")){
            return new PromocionPlatino();
        }
        else if(tipoPromocion.equals("Dorada")){
            return new PromocionDorada();
        }
        return null;
    }

    public PromocionFactory(){

    }
}
