package modelo;

import java.io.Serializable;


public class DecoratorCheque extends DecoratorMetodosDePago implements Serializable{

    public DecoratorCheque(IFactura encapsulado) {
        super(encapsulado);
    }

	
	@Override
    public double calcular() {
        return this.encapsulado.calcular()*1.1;
    }

}
