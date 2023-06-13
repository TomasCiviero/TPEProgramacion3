package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class ConContratacionState implements IState,Serializable{
    private PersonaFisica personaFisica;

    public ConContratacionState(PersonaFisica personaFisica){
        this.personaFisica = personaFisica;
    }

    @Override
    public void nuevaFacturaAPagar() {
        if (personaFisica.getFacturasAPagar().size() > 2) {
            personaFisica.setEstado(new MorosoState(personaFisica));
        }
    }
    public PersonaFisica getPersonaFisica() {
		return personaFisica;
	}

	public void setPersonaFisica(PersonaFisica personaFisica) {
		this.personaFisica = personaFisica;
	}

    @Override
    public void pagarFactura(IFactura factura) {
        int i=0;
        while (i<personaFisica.getFacturasAPagar().size() && personaFisica.getFacturasAPagar().get(i) != factura) {
            i++;
        }
        if (i<personaFisica.getFacturasAPagar().size()){ //esta
            IFactura facturaPagada = personaFisica.getFacturasAPagar().remove(i);
            personaFisica.getFacturasPagadas().add(facturaPagada);
        }
    }

    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasAPagar() {
        ArrayList<ResumenFactura> arregloResumen = new ArrayList<ResumenFactura>();
        this.personaFisica.getFacturasAPagar().forEach(factura ->{
            ResumenFactura resumen = new ResumenFactura(factura,factura.calcular());
            arregloResumen.add(resumen);
        });
        return arregloResumen;
    }

    @Override
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id) {
        
    	return this.personaFisica.getFacturaDelMes().contratarServicio(tipoContratacion,tipoPromocion, cantidadBotones,cantidadCamaras,tieneMovil,calle,numero,id);
    }

    @Override
    public void darDeBajaServicio(int idContratacion) {
        this.personaFisica.getFacturaDelMes().eliminarContratacion(idContratacion);

        if (personaFisica.getFacturaDelMes().getContrataciones().size() == 0){
            personaFisica.setEstado(new SinContratacionState(personaFisica));
        }
    }
}
