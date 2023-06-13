package modelo;

import java.io.Serializable;
import java.util.HashMap;

public class EmpresaDTO implements Serializable {
    private HashMap<Integer,Persona> abonados = new HashMap<Integer,Persona>();
    private int idParaFacturas;
    private int idParaContrataciones;
    public EmpresaDTO(){

    }

    public EmpresaDTO(HashMap<Integer,Persona> abonados, int idcontrataciones,int idfacturas){
        this.abonados = abonados;
        this.idParaContrataciones= idcontrataciones;
        this.idParaFacturas=idfacturas;
    }


    public HashMap<Integer, Persona> getAbonados() {
        return abonados;
    }

    public void setAbonados(HashMap<Integer, Persona> abonados) {
        this.abonados = abonados;
    }

    public void setIdParaFacturas(int idParaFacturas) {
        this.idParaFacturas = idParaFacturas;
    }

    public int getIdParaFacturas() {
        return idParaFacturas;
    }

    public int getIdParaContrataciones() {
        return idParaContrataciones;
    }

    public void setIdParaContrataciones(int idParaContrataciones) {
        this.idParaContrataciones = idParaContrataciones;
    }
}
