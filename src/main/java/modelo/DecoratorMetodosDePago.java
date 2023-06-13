package modelo;

import java.io.Serializable;

public abstract class DecoratorMetodosDePago implements IFactura,Serializable{

    protected IFactura encapsulado;

    public DecoratorMetodosDePago(IFactura encapsulado){
        this.encapsulado = encapsulado;
    }

}
