package modelo;

public class PromocionDorada extends Promocion {

    @Override
    public void aplicarPromocion(Promocionable promocionable) {
        promocionable.aplicarPromocionDorada();
    }

}
