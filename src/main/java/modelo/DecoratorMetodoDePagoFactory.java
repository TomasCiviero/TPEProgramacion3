package modelo;


public class DecoratorMetodoDePagoFactory {

    public DecoratorMetodosDePago crearDecoratorMetodoDepago(String metodoDePago, IFactura encapsulado){
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
