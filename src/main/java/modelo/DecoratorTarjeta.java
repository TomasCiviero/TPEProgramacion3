package modelo;


/**
 * <br>
 * Clase que representa el pago de la factura con el tipo tarjeta.
 * Contiene el un encapsulado de tipo IFactura heredado.
 */
public class DecoratorTarjeta extends DecoratorMetodosDePago {


    /**
     * Constructor que setea el Decorator de tipo tarjeta.
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    public DecoratorTarjeta(IFactura encapsulado) {
        super(encapsulado);
    }

    public DecoratorTarjeta(){

    }

    /**
     * Metodo que calcula el total de la factura con el metodo de pago
     * tarjeta.
     * @return el valor final de la factura@return el valor final de 
     * la factura con el metodo de pago tarjeta.
     */
    @Override
    public double calcular() {

        return this.encapsulado.calcular()*1.05;
    }

    public void setEncapsulado(IFactura encapsulado){
        this.encapsulado = encapsulado;
    }

    public IFactura getEncapsulado(IFactura encapsulado){
        return encapsulado;
    }
    /**
     * Metodo sobreescrito de la clase object, que clona la iFactura con metodo de pago tarjeta.
     * @return La referencia a la iFactura con metodo de pago tarjeta.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        DecoratorTarjeta clonDecorator = (DecoratorTarjeta) super.clone();
        clonDecorator.encapsulado = (IFactura) encapsulado.clone();
        return clonDecorator;
    }
}
