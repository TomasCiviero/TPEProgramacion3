package modelo;

import java.io.Serializable;

public class FacturaFactory implements Serializable{

    public Factura crearFactura(String tipoFactura, int id) {
        if(tipoFactura.equals("Jurídica")){
            return new FacturaJuridica(id);
        }
        else if(tipoFactura.equals("Física")){
            return new FacturaFisica(id);
        }
        return null;
    }
}
