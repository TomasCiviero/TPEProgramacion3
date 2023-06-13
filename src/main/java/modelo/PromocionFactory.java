package modelo;

import java.io.Serializable;

public class PromocionFactory implements Serializable {
    public  Promocion crearPromocion(String tipoPromocion){
        if(tipoPromocion.equals("Platino")){
            return new PromocionPlatino();
        }
        else if(tipoPromocion.equals("Dorada")){
            return new PromocionDorada();
        }
        return null;
    }
}
