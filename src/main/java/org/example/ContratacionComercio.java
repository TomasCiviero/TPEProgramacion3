package org.example;

/**
 * <br>
 * Clase que representa una contratacion de tipo Comercio dentro de la empresa.
 * Calcula el valor de la contratacion para el tipo Comercio
 */
public class ContratacionComercio extends Contratacion {

    private static final double VALORBASE=10000;

    /**
     * Constructor con tres parametros int para setear la contratacion
     * A la vez, inicializa el ID único para cada Contratación
     * <b>Pre:</b> la cantidad de botones,camaras y moviles debe ser
     * mayor o igual a 0. Y domicilio tiene que ser distinto de null
     *
     * @param cantBotones Cantidad de botones de la contratacion
     * @param cantCamaras Cantidad de camaras de la contratacion
     * @param cantMoviles Cantidad de moviles de la contratacion
     * @param domicilio Domicilio de la contratacion
     */
    public ContratacionComercio(int cantBotones, int cantCamaras, int cantMoviles, Domicilio domicilio) {
        super(cantBotones, cantCamaras, cantMoviles, domicilio);
    }

    /**
     * Metodo sobreescrito que sirve para calcular la contratacion de tipo Comercio
     * @return El valor final de la contratacion
     */
    @Override
    public double calcularContratacion() {
        return VALORBASE+super.getCantBotones()*PRECIOBOTON+super.getCantCamaras()*PRECIOCAMARA+super.getCantMoviles()*PRECIOMOVIL;
    }

    /**
     * Metodo que sirve para calcular el valor despues de aplicarle promocion Platino <br>
     */
    @Override
    public void aplicarPromocionPlatino() {
        super.setTotal(calcularContratacion()*0.65);
    }

    /**
     * Metodo que sirve para calcular el valor despues de aplicarle promocion Dorada<br>
     */
    @Override
    public void aplicarPromocionDorada() {
        super.setTotal(calcularContratacion()-2500);
    }


    /**
     * Metodo sobreescrito de la clase object, que clona una contratacion de tipo comercio
     * @return La referencia a la contratacion de tipo comercio clonada.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        ContratacionComercio clone = (ContratacionComercio) super.clone();
        Domicilio clonDomicilio = clone.getDomicilio();
        clone.setDomicilio((Domicilio) clonDomicilio.clone());
        return clone;
    }
}
