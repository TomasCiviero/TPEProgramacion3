package modelo;

import java.util.ArrayList;

public interface IState { //El tema es, de donde salen los parametros (factura, contratacion), el controlador se encarga?
    void pagarFactura(IFactura factura);
    boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero);
    void darDeBajaServicio(int idContratacion);
    void nuevaFacturaAPagar();
    ArrayList<ResumenFactura> resumenDeFacturasAPagar();
}
