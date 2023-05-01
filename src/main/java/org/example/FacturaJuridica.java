package org.example;

/**
 * <br>
 * Clase que calcula el valor final de todas las contrataciones 
 * de una persona juridica
 */
public class FacturaJuridica extends Factura {

    /**
     * <br>
     * Constructor que se encarga de setear la factura juridica
     * <b>Pre:</b> abonado distinto de null
     * @param abonado Persona juridica la cual la Empresa le da una factura
     */
    public FacturaJuridica(Persona abonado){
        super(abonado);
    }
    /**
     * Metodo sobreescrito que sirve para calcular la factura 
     * final sumando todas las contrataciones, luego de la tercera
     *  se suma pero con %50 de descuento.
     * @return El valor total de las contrataciones para una 
     * persona juridica
     */
    @Override
    public double calcular() {
        double suma = 0;
        for(int i = 0; i <super.getContrataciones().size(); ++i){
            if(i>=2)
                suma += super.getContrataciones().get(i).getTotal()*0.5;
            else
                suma += super.getContrataciones().get(i).getTotal();
        }
        return suma;
    }

    /**
     * Metodo sobreescrito de la clase object, que no clona
     * @return una excepcion para que nunca se pueda clonar
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
