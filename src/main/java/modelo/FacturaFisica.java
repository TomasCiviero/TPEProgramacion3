package modelo;

import java.util.ArrayList;

/**
 * <br>
 * Clase que calcula el valor final de todas las contrataciones 
 * de una persona fisica
 */
public class FacturaFisica extends Factura {

    //Constructor
    public FacturaFisica(){

    }

    @Override
    public double calcular() {
        double suma = 0;
        for(int i = 0; i <super.getContrataciones().size(); ++i){
            suma += super.getContrataciones().get(i).getTotal();
        }
        return suma;
    }





}

