package org.example;

/**
 * <br>
 * Clase abstracta  que se encarga de la creacion de la clase Contratacion
 */
public abstract class ContratacionFactory {

    public abstract Contratacion crearContratacion(int cantBotones, int cantCamaras, int cantMoviles, Domicilio domicilio);
}
