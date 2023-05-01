package org.example;

/**
 * <br>
 * Clase que representa una contratacion de tipo Vivienda dentro de la empresa.
 * Calcula el valor de la contratacion para el tipo Vivienda
 */
public class ContratacionVivienda extends Contratacion{

    private static final double VALORBASE=8500;

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

    public ContratacionVivienda(int cantBotones, int cantCamaras, int cantMoviles, Domicilio domicilio) {
        super(cantBotones, cantCamaras, cantMoviles,domicilio);
    }


    //Metodos

    /**
     * Metodo sobreescrito que sirve para calcular la contratacion de tipo Vivienda.
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
        super.setTotal(calcularContratacion()*0.7);
    }

    /**
     * Metodo que sirve para calcular el valor despues de aplicarle promocion Dorada<br>
     */
    @Override
    public void aplicarPromocionDorada() {
        super.setTotal(calcularContratacion()-1500);
    }


    /**
     * Metodo sobreescrito de la clase object, que clona una contratacion de tipo Vivienda
     * @return La referencia a la contratacion clonada.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        ContratacionVivienda clone = (ContratacionVivienda) super.clone();
        Domicilio clonDomicilio = clone.getDomicilio();
        clone.setDomicilio((Domicilio) clonDomicilio.clone());
        return clone;
    }


}
