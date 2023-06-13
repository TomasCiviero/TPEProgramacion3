package concurrencia;
import java.util.ArrayList;
import java.util.Observable;

import modelo.Persona;

public class Tecnicos extends Observable {

    private String mensaje;
    private ArrayList<String> tecnicos = new ArrayList<String>();

    public synchronized void agarrarTecnico(Persona persona){ //el tema del nombre de la persona lo resolvi por polimorfismo
        //while (this.cantidadTecnicos == 0) {
        while (this.tecnicos.size() ==0){
            try { 
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        mensaje = new String(persona + "  esta siendo atendida por "+tecnicos.get(0) + "\n"+ "\n");
        persona.setNombreTecnico(tecnicos.remove(0));

        
        setChanged();
        notifyObservers(mensaje);
      
    }

    public synchronized void devolverTecnico(Persona persona){ //el tema del nombre de la persona lo resolvi por polimorfismo
        //this.cantidadTecnicos++;
        mensaje = new String(persona +" Ya libero a "+persona.getNombreTecnico()+"\n"+"\n");
        tecnicos.add(persona.getNombreTecnico());
        
 
        setChanged();
        notifyObservers(mensaje);
        notifyAll();
    }

    //Getter

    public ArrayList<String> getTecnicos() {
        return tecnicos;
    }


    public String getMensaje() {
        return mensaje;
    }
    
    public void agregarTecnicos(String nombre) {
    	tecnicos.add(nombre);
    }
}
