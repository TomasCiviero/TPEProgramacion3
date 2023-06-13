package modelo;

public class DecoratorEfectivo extends DecoratorMetodosDePago{


    public DecoratorEfectivo(IFactura encapsulado) {
        super(encapsulado);
    }

    @Override
    public double calcular() {

        return this.encapsulado.calcular()*0.8;
    }

}
