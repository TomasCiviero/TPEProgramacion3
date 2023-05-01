package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de las personas juridicas
 * En esta clase va toda la logica de la creacion
 */
public class PersonaJuridicaFactory extends  PersonaFactory{

    /**
     * Constructor que crea la persona juridica
     */
    @Override
    public Persona crearPersona() {
        return new PersonaJuridica();
    }
}
