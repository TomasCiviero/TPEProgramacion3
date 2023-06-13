package modelo;

import java.io.Serializable;

public abstract class Promocion implements Serializable {

    public abstract void aplicarPromocion(Promocionable promocionable);

}
