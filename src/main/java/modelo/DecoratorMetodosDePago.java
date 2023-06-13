package modelo;

import java.time.LocalDate;


/**
 * <br>
 * Clase que representa el metodo de pago con el que se va 
 * a pagar la factura.
 * Contiene el un encapsulado de tipo IFactura
 */

public abstract class DecoratorMetodosDePago implements IFactura{

    protected IFactura encapsulado;

    /**
     * Constructor que setea el Decorator de Metodo de Pago.
     * <b>Pre:</b>  El encapsulado tiene que ser distinto de null.
     * @param encapsulado Objeto de tipo IFactura que se usa para encapsular.
     */
    public DecoratorMetodosDePago(IFactura encapsulado){
        this.encapsulado = encapsulado;
    }

    public DecoratorMetodosDePago(){

    }

    public void setEncapsulado(IFactura encapsulado){
        this.encapsulado = encapsulado;
    }

    public IFactura getEncapsulado(IFactura encapsulado){
        return encapsulado;
    }

    /**
     * Metodo sobreescrito de la clase object, que clona el decorator tipo  metodo de pago.
     * @return La referencia a el decorator tipo  metodo de pago..
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
   /*
    public LocalDate getCalendar() {
    	return encapsulado.getCalendar();
    }
    public void setCalendar(LocalDate calendar) {
    	encapsulado.setCalendar(calendar);
    }
    */
}
