package org.example;
/**
 * <br>
 * Clase concreta que sirve para representar los datos de una 
 * Persona fisica
 */
public class PersonaFisica extends Persona {

    private int dni;
    /**
     * Metodo sobreescrito de la clase object que sirve para clonar una
     * persona fisica.
     * @return La referencia a la persona fisica clonada.
     */
    @Override
    public Object clone() {
        PersonaFisica clonado = null;
        try {
            clonado = (PersonaFisica) super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return clonado;
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
