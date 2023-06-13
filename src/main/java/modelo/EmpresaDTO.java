package modelo;

import java.io.Serializable;
import java.util.HashMap;

public class EmpresaDTO implements Serializable {
    private String nombre;
    private HashMap<Integer,Persona> abonados = new HashMap<Integer,Persona>();

    public EmpresaDTO(){

    }

    public EmpresaDTO(String nombre, HashMap<Integer,Persona> abonados){
        this.nombre = nombre;
        this.abonados = abonados;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, Persona> getAbonados() {
        return abonados;
    }

    public void setAbonados(HashMap<Integer, Persona> abonados) {
        this.abonados = abonados;
    }
}
