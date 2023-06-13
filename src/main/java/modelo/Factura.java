package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Factura implements IFactura,Serializable{
    private int id;
    private ArrayList<Contratacion> contrataciones = new ArrayList<Contratacion>();

    public Factura(int id){
        this.id = id;
    }


    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id){
        int i = 0;
        while(i < contrataciones.size() && !(contrataciones.get(i).getDomicilio().getNumero().equals(numero) && contrataciones.get(i).getDomicilio().getCalle().equals(calle))){
            i++;
        }
        if(i == contrataciones.size()){
            Domicilio dom = new Domicilio(calle,numero);
            ContratacionFactory contraFac = new ContratacionFactory();
            PromocionFactory promoFac = new PromocionFactory();
            Promocion promo = promoFac.crearPromocion(tipoPromocion);
            Contratacion nuevaContratacion = contraFac.crearContratacion(tipoContratacion,cantidadBotones,cantidadCamaras,tieneMovil,dom,id);
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


    public ArrayList<Contratacion> getContrataciones() {
        return contrataciones;
    }

    public int getId() {
        return id;
    }
    
}
