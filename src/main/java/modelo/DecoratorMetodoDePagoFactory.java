package modelo;

/**
 * <br>
 * Clase que se encarga de la creacion de los Decorator de tipo Metodo De pago.
 */
public class DecoratorMetodoDePagoFactory {

    public DecoratorMetodoDePagoFactory(){

    }
    public DecoratorMetodosDePago crearDecoratorMetodoDepago(String metodoDePago, IFactura encapsulado){
        System.out.println(encapsulado+"10");
    	if(metodoDePago.equals("Tarjeta")){
            return new DecoratorTarjeta(encapsulado);
        }
        else if(metodoDePago.equals("Efectivo")){
            return new DecoratorEfectivo(encapsulado);
        }
        else if(metodoDePago.equals("Cheque")){
            return new DecoratorCheque(encapsulado);
        }
        return null;
    }
}
