package modelo;

public class PromocionPlatino extends Promocion {
    @Override
    public void aplicarPromocion(Promocionable promocionable) {
        promocionable.aplicarPromocionPlatino();
    }
}
