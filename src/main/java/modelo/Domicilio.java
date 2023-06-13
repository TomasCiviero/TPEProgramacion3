package modelo;

import java.io.Serializable;


public class Domicilio implements Cloneable,Serializable {

    private String calle;
    private String numero;


    public Domicilio(String calle, String numero){
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

}
