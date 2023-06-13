package modelo;

import java.io.Serializable;
import java.util.ArrayList;


public class FacturaFisica extends Factura implements Serializable{

    public FacturaFisica(int id){
        super(id);
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

