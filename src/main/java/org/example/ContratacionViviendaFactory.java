package org.example;

/**
 * <br>
 * Clase que se encarga de la creacion de la clase Contratacion tipo vivienda
 * En esta clase va toda la logica de la creacion
 */
public class ContratacionViviendaFactory extends ContratacionFactory{

    /**
     * Constructor con tres parametros int para setear la contratacion
     * <b>Pre:</b> la cantidad de botones,camaras y moviles debe ser
     * mayor o igual a 0. Y domicilio tiene que ser distinto de null
     *
     * @param cantBotones Cantidad de botones de la contratacion
     * @param cantCamaras Cantidad de camaras de la contratacion
     * @param cantMoviles Cantidad de moviles de la contratacion
     * @param domicilio Domicilio de la contratacion
     */
    @Override
    public Contratacion crearContratacion(int cantBotones, int cantCamaras, int cantMoviles, Domicilio domicilio) {
        return new ContratacionVivienda(cantBotones, cantCamaras, cantMoviles, domicilio);
    }
}
