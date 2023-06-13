package controladores;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import modelo.Empresa;
import modelo.Persistidor;
import modelo.PersonaFisica;
import concurrencia.Tecnicos;
import concurrencia.Observador_Tecnicos;
import ventanas.IVista;
import ventanas.Ventana_VisitaTecnico;

public class ControladorVentanaTecnicos implements WindowListener {
	
	private IVista vista;
	private Empresa empresa;
	

	
	public ControladorVentanaTecnicos(Empresa empresa,ArrayList<String> tecnico) {
		vista=new Ventana_VisitaTecnico();
		
		this.empresa=empresa;
		vista.setWindowListener(this);
		
		Tecnicos tecnicos=new Tecnicos();
		Observador_Tecnicos obs=new Observador_Tecnicos(tecnicos, (Ventana_VisitaTecnico) vista);
    	
    	
		for(int i=0;i<tecnico.size();i++)
			tecnicos.agregarTecnicos(tecnico.get(i));
    	
        Thread usuario1= new Thread(new PersonaFisica(4012345,tecnicos,"Dario"));
        Thread usuario2= new Thread(new PersonaFisica(3095688,tecnicos,"Gonzalo"));
        Thread usuario3= new Thread(new PersonaFisica(2742139,tecnicos,"Ignacio"));
        Thread usuario4= new Thread(new PersonaFisica(4554455,tecnicos,"Tomas"));
        Thread usuario5= new Thread(new PersonaFisica(1234567,tecnicos,"Ana"));
        Thread usuario6= new Thread(new PersonaFisica(5023412,tecnicos,"Ivonne"));
        Thread usuario7= new Thread(new PersonaFisica(4012345,tecnicos,"Guillermo"));
        Thread usuario8= new Thread(new PersonaFisica(3095688,tecnicos,"Leonel"));
        Thread usuario9= new Thread(new PersonaFisica(2742139,tecnicos,"Jose"));
        Thread usuario10= new Thread(new PersonaFisica(4554455,tecnicos,"Maria"));
        Thread usuario11= new Thread(new PersonaFisica(1234567,tecnicos,"Patricio"));
        Thread usuario12= new Thread(new PersonaFisica(5023412,tecnicos,"German"));
        Thread usuario13= new Thread(new PersonaFisica(4012345,tecnicos,"Pecker"));
        Thread usuario14= new Thread(new PersonaFisica(3095688,tecnicos,"Javier"));
        Thread usuario15= new Thread(new PersonaFisica(2742139,tecnicos,"Daniel"));
        Thread usuario16= new Thread(new PersonaFisica(4554455,tecnicos,"Mirabella"));
        Thread usuario17= new Thread(new PersonaFisica(1234567,tecnicos,"Zarlenga"));
        Thread usuario18= new Thread(new PersonaFisica(5023412,tecnicos,"Messi"));

        usuario1.start();
        usuario2.start();
        usuario3.start();
        usuario4.start();
        usuario5.start();
        usuario6.start();
        usuario7.start();
        usuario8.start();
        usuario9.start();
        usuario10.start();
        usuario11.start();
        usuario12.start();
        usuario13.start();
        usuario14.start();
        usuario15.start();
        usuario16.start();
        usuario17.start();
        usuario18.start();
        
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosed(WindowEvent e) {
		
	}



	@Override
	public void windowClosing(WindowEvent e) {
		Persistidor persistidor=new Persistidor();
		try {
			persistidor.Persistir();
		} catch (Exception e1) {
		}
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void ejecutar() {
		this.vista.ejecutar();
	}
	
}
