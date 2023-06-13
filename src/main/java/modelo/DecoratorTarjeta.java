package modelo;

public class DecoratorTarjeta extends DecoratorMetodosDePago {

    public DecoratorTarjeta(IFactura encapsulado) {
        super(encapsulado);
    }

    @Override
    public double calcular() {

        return this.encapsulado.calcular()*1.05;
    }

}
