package org.example;
/**
 * <br>
 * Clase concreta que sirve para representar los datos de una Persona juridica
 */
public class PersonaJuridica extends Persona {

	 /**
     * Metodo sobreescrito de la clase object que sirve para que nunca clone.
     * @return una excepcion.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }



}
