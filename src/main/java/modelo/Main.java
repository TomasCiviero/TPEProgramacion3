package modelo;

import controladores.ControladorVentanaLogin;


public class Main {

	public static void main(String[] args) {
		
		Empresa empresa=Empresa.getInstance();
	
		/*
		Persistidor persistidor=new Persistidor();
		try {
			persistidor.Despersistir();
		} catch (Exception e) {
			
		}
		*/
		ControladorVentanaLogin controladorVentanaLogin=new ControladorVentanaLogin(empresa);
		
		controladorVentanaLogin.ejecutar();
		
	}

}