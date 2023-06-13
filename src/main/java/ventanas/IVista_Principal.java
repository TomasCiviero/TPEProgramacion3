package ventanas;

import java.util.ArrayList;

import modelo.ResumenContratacion;
import modelo.ResumenFactura;

public interface IVista_Principal extends IVista{

	public ResumenFactura pagarFacturas();
	
	public void contratarServicios();
	
	public ResumenContratacion dardeBaja() ;
	
	public void historialFacturas(ArrayList<ResumenFactura> resumen);
	public void actualizarServicios(ArrayList<ResumenContratacion> resumen);
	
	public int getCantBotones();
	public int getCantCamaras();
	public String getTipoContratacion();
	public String getTipoPromo();

	public boolean getjCheckBoxAcompaniamiento();

	public String getCalle();
	public String getNumero() ;
	public void botonActualizar(ArrayList<ResumenFactura> resumen) ;
	
	public void setBoton(String metodo);
	public String getMetodoPago();
	public void limpiarContratar();
}
