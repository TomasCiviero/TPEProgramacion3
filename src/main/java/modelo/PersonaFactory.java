package modelo;

/**
 * <br>
 * Clase que se encarga de la creacion de las Personas
 */
public class PersonaFactory {
    /**
     * Constructor que crea una persona
     */

    public PersonaFactory(){

    }
    public Persona crearPersona(String tipoPersona, int id){
        if(tipoPersona.equals("Jurídica")){
            return new PersonaJuridica(id);
        }
        else if(tipoPersona.equals("Física")){
            return new PersonaFisica(id);
        }
        return null;
    }
}
