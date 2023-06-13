package modelo;

import java.io.Serializable;


public class PersonaFactory implements Serializable{
    public Persona crearPersona(String tipoPersona, int id,int idFactura){
        if(tipoPersona.equals("Jurídica")){
            return new PersonaJuridica(id,idFactura);
        }
        else if(tipoPersona.equals("Física")){
            return new PersonaFisica(id,idFactura);
        }
        return null;
    }
}
