package modelo;

import java.time.LocalDate;
import java.util.ArrayList;


//MODIFICACIONES
/**
 * <br>
 * Clase que representa una factura de una persona fisica o juridica.
 */
public abstract class Factura implements IFactura{
    private  int id;
    private static int sigId = 0;
    private ArrayList<Contratacion> contrataciones=new ArrayList<Contratacion>();
    private LocalDate calendar;

    public Factura(){
        this.id=sigId;
        sigId = sigId + 1;
    }

    //Metodos
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero){
        int i = 0;
        while(i < contrataciones.size() && !(contrataciones.get(i).getDomicilio().getNumero().equals(numero) && contrataciones.get(i).getDomicilio().getCalle().equals(calle))){
            i++;
        }
        if(i == contrataciones.size()){
            Domicilio dom = new Domicilio(calle,numero);
            ContratacionFactory contraFac = new ContratacionFactory();
            PromocionFactory promoFac = new PromocionFactory();
            Promocion promo = promoFac.crearPromocion(tipoPromocion);
            Contratacion nuevaContratacion = contraFac.crearContratacion(tipoContratacion,cantidadBotones,cantidadCamaras,tieneMovil,dom);
            promo.aplicarPromocion(nuevaContratacion);
            contrataciones.add(nuevaContratacion);
            return true;
        }
        return false;
    }

    public void eliminarContratacion(int idContratacion){
        int i=0;
        while (i<getContrataciones().size() && (getContrataciones().get(i).getId() != idContratacion ) ){
            i++;
        }
        if (i<getContrataciones().size()){
            getContrataciones().remove(i);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    //Getters
    public ArrayList<Contratacion> getContrataciones() {
        return contrataciones;
    }

    public int getId() {
        return id;
    }

    //Setters
    public void setContrataciones(ArrayList<Contratacion> contrataciones){
        this.contrataciones = contrataciones;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCalendar(LocalDate calendar) {
		this.calendar = calendar;
	}
	public LocalDate getCalendar() {
		return calendar;
	}
    
}
