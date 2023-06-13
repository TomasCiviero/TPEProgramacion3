package modelo;

/**
 * <br>
 * Clase abstracta  que se encarga de la creacion de la clase Contratacion
 */
public class ContratacionFactory {

    public Contratacion crearContratacion(String tipoContratacion,int cantBotones, int cantCamaras, boolean cantMoviles, Domicilio domicilio){
        if(tipoContratacion.equals("Vivienda")){
            return new ContratacionVivienda(cantBotones,cantCamaras,cantMoviles,domicilio);
        }
        else if(tipoContratacion.equals("Comercio")){
            return new ContratacionComercio(cantBotones,cantCamaras,cantMoviles,domicilio);
        }
        return null;
    }
}
