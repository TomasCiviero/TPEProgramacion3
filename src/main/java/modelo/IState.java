package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public interface IState extends Serializable { 
    void pagarFactura(IFactura factura);
    boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id);
    void darDeBajaServicio(int idContratacion);
    void nuevaFacturaAPagar();
    ArrayList<ResumenFactura> resumenDeFacturasAPagar();
}
