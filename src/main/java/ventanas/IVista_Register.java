package ventanas;

import java.awt.event.KeyListener;

public interface IVista_Register extends IVista,KeyListener{

	
	int getDni();
	String getContra();
	String getTelefono();
	String getEmail();
	String getNombre();
	String getApellido();
	String gettipo();
	
	
	void muestraFisico();
	void muestraJuridico();
	void chequear();
}
