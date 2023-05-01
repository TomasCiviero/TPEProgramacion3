package org.example;

/**
 * <br>
 * Clase que representa el pago de la factura con el tipo cheque.
 * Contiene el un encapsulado de tipo IFactura heredado.
 */
public class DecoratorCheque extends DecoratorMetodosDePago{

    /**
     *Constructor que setea el Decorator de tipo Cheque.
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    public DecoratorCheque(IFactura encapsulado) {
        super(encapsulado);
    }

    /**
     * Metodo que calcula el total de la factura con el metodo de pago
     * cheque.
     * @return el valor final de la factura con el metodo de pago cheque.
     */
	
	@Override
    public double calcular() {
        return this.encapsulado.calcular()*1.1;
    }

    /**
     * Metodo sobreescrito de la clase object, que clona la iFactura con metodo de pago cheque.
     * @return La referencia a la iFactura con metodo de pago cheque.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        DecoratorCheque clonDecorator = (DecoratorCheque) super.clone();
        clonDecorator.encapsulado = (IFactura) encapsulado.clone();
        return clonDecorator;
    }
}
