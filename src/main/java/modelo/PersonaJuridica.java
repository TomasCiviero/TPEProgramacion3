package modelo;
import java.util.ArrayList;

public class PersonaJuridica extends Persona {
    private int id;
    public PersonaJuridica(int id,int idFactura) {
        this.id = id;
        this.facturaDelMes = new FacturaJuridica(idFactura);
    }

    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasAPagar() {
        ArrayList<ResumenFactura> arregloResumen = new ArrayList<>();

        this.getFacturasAPagar().forEach(factura ->{
            ResumenFactura resumen = new ResumenFactura(factura,factura.calcular());
            arregloResumen.add(resumen);
        });

        return arregloResumen;
    }

    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasPagadas() {
        ArrayList<ResumenFactura> arregloResumen = new ArrayList<>();

        this.getFacturasPagadas().forEach(factura ->{
            ResumenFactura resumen = new ResumenFactura(factura,factura.calcular());
            arregloResumen.add(resumen);
        });

        return arregloResumen;
    }

    @Override
    public void finDelMes(String metodoPago,int idParaFacturas) {
    	if(getFacturaDelMes().getContrataciones().size()>0) {

    		DecoratorMetodoDePagoFactory decFac = new DecoratorMetodoDePagoFactory();
    		IFactura facturaFinalDelMes = decFac.crearDecoratorMetodoDepago(metodoPago, facturaDelMes);
    		getFacturasAPagar().add(facturaFinalDelMes);
    		Factura facAux = facturaDelMes;
    		facturaDelMes = null;
    		
    		
    		facturaDelMes = new FacturaJuridica(idParaFacturas);
    		for(int i = 0; i < facAux.getContrataciones().size(); ++i){
    			facturaDelMes.getContrataciones().add(facAux.getContrataciones().get(i));
    		}
    	}
    }

    @Override
    public void darDeBajaServicio(int idContratacion){
        this.facturaDelMes.eliminarContratacion(idContratacion);
    }

    @Override
    public void pagarFactura(IFactura factura){
        int i=0;
        while (i<getFacturasAPagar().size() && getFacturasAPagar().get(i) != factura) {
            i++;
        }
        if (i<getFacturasAPagar().size()){ //esta
            IFactura facturaPagada = getFacturasAPagar().remove(i);
            getFacturasPagadas().add(facturaPagada);
        }
    }

    @Override
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id){
        return this.facturaDelMes.contratarServicio(tipoContratacion,tipoPromocion,cantidadBotones,cantidadCamaras,tieneMovil,calle,numero,id);
    }

    //Getter
    public int getId() {
        return id;
    }

    @Override
    public int getIdentificacion() {
        return this.id;
    }
    
    //Setter
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void setIdentificacion(int id) {
        this.id = id;
    }

    //toString para que aparezca el id de la persona en la concurrencia (no borrar)
    @Override
    public String toString() {
        return "id=" + id;
    }


}
