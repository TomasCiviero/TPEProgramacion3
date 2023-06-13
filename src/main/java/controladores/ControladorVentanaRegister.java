package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import modelo.Empresa;
import modelo.Persistidor;
import ventanas.IVista;
import ventanas.IVista_Login;
import ventanas.IVista_Register;
import ventanas.Ventana_Register;

public class ControladorVentanaRegister implements ActionListener,WindowListener{

private IVista_Register vista;
private Empresa empresa;
	
	
	public ControladorVentanaRegister(Empresa empresa) {
		vista=new Ventana_Register();
		this.empresa=empresa;
		vista.setActionListener(this);
		vista.setKeyListener();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "INICIO":
			ControladorVentanaLogin controladorVentanaLogin=new ControladorVentanaLogin(empresa);
            controladorVentanaLogin.ejecutar();
			vista.cerrarVentana();
            break;
		case "REGISTRARSE":
			if(empresa.registrar(vista.getDni(),vista.getContra(),vista.getEmail(), vista.getTelefono(),vista.getNombre(),vista.getApellido(),vista.gettipo())) {
				ControladorVentanaLogin controladorVentanaLogin2=new ControladorVentanaLogin(empresa);
            	controladorVentanaLogin2.ejecutar();
            	vista.cerrarVentana();
			}
			else {
				vista.lanzarVentanaEmergente("Usuario ya existente");
			}
            break;
		case "FISICO":
			vista.muestraFisico();
			vista.chequear();
			break;
		
		case "JURIDICO":
			vista.muestraJuridico();
			vista.chequear();
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
