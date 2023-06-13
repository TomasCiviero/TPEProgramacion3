package ventanas;

public interface IVista_Login extends IVista {

	 	int getDnioid();

	    String getContrasena();

	    void nombreUsuarioInvalido();

	    void contrasenaInvalida();
	    public void getTecnico(String tecnico) ;
	    
	    public String ejecutaTecnicos();
}
