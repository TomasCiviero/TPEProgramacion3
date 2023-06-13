package concurrencia;

import java.util.Observable;
import java.util.Observer;

import concurrencia.Tecnicos;
import ventanas.Ventana_VisitaTecnico;

public class Observador_Tecnicos implements Observer {

	Tecnicos observado;
	Ventana_VisitaTecnico vistaTecnico;

    public Observador_Tecnicos(Tecnicos tecnicos,Ventana_VisitaTecnico vista){
        observado = tecnicos;
        observado.addObserver(this);
        
        this.vistaTecnico=vista;
    }

    @Override
    public void update(Observable o, Object arg) {
        String mensaje = (String) arg;
        vistaTecnico.escribe(mensaje);
        //Mostrar por vista el mensaje
    }
}
