package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de los objetos de tipo Domicilio
 * En esta clase va toda la logica de la creacion
 */
public class DomicilioFactory {

    /**
     * Constructor con dos parametros para crear el domicilio
     * <b>Pre:</b> la calle tiene que ser distinta de "" y de null.
     * Y el numero tiene que ser mayor que cero.
     *
     * @param calle Calle en la que esta ubicado el domicilio
     * @param numero numero de la calle en la que esta ubicado el domicilio
     */
    public  Domicilio crearDomicilio(String calle, int numero){
        return new Domicilio(calle, numero);
    }
}
