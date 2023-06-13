package modelo;


/**
 * <br>
 * Clase que representa el pago de la factura con el tipo efectivo.
 * Contiene el un encapsulado de tipo IFactura heredado.
 */
public class DecoratorEfectivo extends DecoratorMetodosDePago{

    /**
     *Constructor que setea el Decorator de tipo Efectivo.
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    public DecoratorEfectivo(IFactura encapsulado) {
        super(encapsulado);
    }

    public DecoratorEfectivo(){

    }

    public void setEncapsulado(IFactura encapsulado){
        this.encapsulado = encapsulado;
    }

    public IFactura getEncapsulado(IFactura encapsulado){
        return encapsulado;
    }
    /**
     * Metodo que calcula el total de la factura con el metodo de pago
     * efectivo.
     * @return el valor final de la factura con el metodo de pago 
     * efectivo .
     */
    @Override
    public double calcular() {

        return this.encapsulado.calcular()*0.8;
    }

    /**
     * Metodo sobreescrito de la clase object, que clona la iFactura con metodo de pago efectivo.
     * @return La referencia a la iFactura con metodo de pago efectivo.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        DecoratorEfectivo clonDecorator = (DecoratorEfectivo) super.clone();
        clonDecorator.encapsulado = (IFactura) encapsulado.clone();
        return clonDecorator;
    }

}
