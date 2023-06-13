package modelo;

import java.io.Serializable;

public class ContratacionFactory implements Serializable {

    public Contratacion crearContratacion(String tipoContratacion,int cantBotones, int cantCamaras, boolean cantMoviles, Domicilio domicilio,int id){
        if(tipoContratacion.equals("Vivienda")){
            return new ContratacionVivienda(cantBotones,cantCamaras,cantMoviles,domicilio,id);
        }
        else if(tipoContratacion.equals("Comercio")){
            return new ContratacionComercio(cantBotones,cantCamaras,cantMoviles,domicilio,id);
        }
        return null;
    }
}
