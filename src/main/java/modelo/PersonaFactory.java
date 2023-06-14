package modelo;

import java.io.Serializable;


public class PersonaFactory implements Serializable{
    public Persona crearPersona(String tipoPersona, int id,int idFactura){
        if(tipoPersona.equals("Juridica")){
            return new PersonaJuridica(id,idFactura);
        }
        else if(tipoPersona.equals("Fisica")){
            return new PersonaFisica(id,idFactura);
        }
        return null;
    }
}
