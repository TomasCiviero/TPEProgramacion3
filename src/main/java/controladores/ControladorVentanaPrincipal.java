package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JSpinner;

import modelo.Empresa;
import modelo.Persistidor;
import modelo.Persona;
import modelo.ResumenFactura;
import ventanas.IVista;
import ventanas.IVista_Principal;
import ventanas.VentanaPrincipal;
import ventanas.Ventana_Login;
import ventanas.Ventana_MetodoDePago;
import ventanas.*;

public class ControladorVentanaPrincipal implements ActionListener,WindowListener{

	private IVista_Principal vista;
	private Empresa empresa;
	private Persona persona;
	private ArrayList<String> tecnico=new ArrayList<String>();
	

	
	public ControladorVentanaPrincipal(Empresa empresa,Persona persona,ArrayList<String> tecnico) {
		vista=new VentanaPrincipal();
		this.tecnico=tecnico;
		this.empresa=empresa;
		this.persona=persona;
		vista.setActionListener(this);	
		vista.setWindowListener(this);
		vista.setKeyListener();
		vista.botonActualizar(empresa.resumenDeFacturasAPagar(persona));
		vista.historialFacturas(empresa.resumenDeFacturasPagadas(persona));
		vista.actualizarServicios(empresa.resumenContratacionesActivas(persona));
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "SOLICITAR":
			ControladorVentanaTecnicos controladorVentanaTecnicos=new ControladorVentanaTecnicos(empresa,tecnico);
			controladorVentanaTecnicos.ejecutar();
            break;
		case "CERRARSESION":
			ControladorVentanaLogin controladorVentanaLogin=new ControladorVentanaLogin(empresa);
            controladorVentanaLogin.ejecutar();
			vista.cerrarVentana();
            break;
		case "ACTUALIZAR":
				if(empresa.resumenContratacionesActivas(persona).size()>0) {
					empresa.finDelMes(persona,vista.getMetodoPago());
					vista.botonActualizar(empresa.resumenDeFacturasAPagar(persona));
					
					Persistidor persistidor=new Persistidor();
					try {
						persistidor.Persistir();
					} catch (Exception e1) {

					}
					
				}
            break;
		case "CONTRATAR":
			empresa.contratarServicio(persona,vista.getTipoContratacion(),vista.getTipoPromo(),vista.getCantBotones(),vista.getCantCamaras(),vista.getjCheckBoxAcompaniamiento(),vista.getCalle(),vista.getNumero());
			vista.limpiarContratar();
			vista.lanzarVentanaEmergente("Se creo la contratacion exitosamente");
			vista.actualizarServicios(empresa.resumenContratacionesActivas(persona));
			break;
		case "DARDEBAJA":
			empresa.darDeBajaServicio(persona,vista.dardeBaja());
        break;
		case "PAGAR":
			vista.lanzarVentanaEmergente("Se pago la factura");
			ResumenFactura resumenFactura=vista.pagarFacturas();
			empresa.pagarFactura(persona,resumenFactura);
			vista.historialFacturas(empresa.resumenDeFacturasPagadas(persona));
			
        break;    
		}
		
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
	
	public void ejecutar() {
		this.vista.ejecutar();
	}
	
}
