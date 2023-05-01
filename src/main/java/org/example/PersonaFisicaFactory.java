package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de las personas fisicas
 * En esta clase va toda la logica de la creacion
 */
public class PersonaFisicaFactory extends PersonaFactory{

    /**
     * Constructor que crea la persona fisica
     */
    @Override
    public Persona crearPersona() {
        return new PersonaFisica();
    }
}
