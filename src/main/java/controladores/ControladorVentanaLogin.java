package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import concurrencia.Tecnicos;
import modelo.Empresa;
import modelo.Persistidor;
import modelo.Persona;
import ventanas.IVista;
import ventanas.IVista_Login;
import ventanas.VentanaPrincipal;
import ventanas.Ventana_Login;

public class ControladorVentanaLogin implements ActionListener,WindowListener{

private IVista_Login vista;
private Empresa empresa;
private ArrayList<String> tecnico=new ArrayList<String>();

	
	
	public ControladorVentanaLogin(Empresa empresa) {
		vista=new Ventana_Login();
		this.empresa=empresa;
		vista.setActionListener(this);
		vista.setKeyListener();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "ENTRAR":
			Persona persona;
			persona=empresa.ingresar(vista.getDnioid(),vista.getContrasena());
			if(persona!=null) {
				ControladorVentanaPrincipal controladorVentanaPrincipal=new ControladorVentanaPrincipal(empresa,persona,tecnico); 
				controladorVentanaPrincipal.ejecutar();
				vista.cerrarVentana();
			}
			else {
				vista.contrasenaInvalida();
				vista.lanzarVentanaEmergente("Usuario o contraseña incorrecto");
			}
            break;
		case "REGISTRARTE":
			ControladorVentanaRegister controladorVentanaRegister= new ControladorVentanaRegister(empresa);
			controladorVentanaRegister.ejecutar();
			vista.cerrarVentana();
            break;
		case "ALTA":
				tecnico.add(vista.ejecutaTecnicos());
			break;
		}
		
	}
	
	public void ejecutar() {
		this.vista.ejecutar();
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
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

}
