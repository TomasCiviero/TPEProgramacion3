package modelo;

import java.util.ArrayList;

public class MorosoState implements IState{
    private PersonaFisica personaFisica;

    //Constructor
    public MorosoState(PersonaFisica personaFisica){
        this.personaFisica = personaFisica;
    }

    public MorosoState(){

    }

    //Metodos
    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasAPagar() {
        ArrayList<ResumenFactura> arregloResumen = new ArrayList<>();

        this.personaFisica.getFacturasAPagar().forEach(factura ->{
            ResumenFactura resumen = new ResumenFactura(factura,factura.calcular()*1.3); //se le aplica el recargo del 30%
            arregloResumen.add(resumen);
        });

        return arregloResumen;
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

        if (personaFisica.getFacturasAPagar().size() <=2) { //cambia de estado
            personaFisica.setEstado(new ConContratacionState(personaFisica));
        }
    }

    @Override
    public void nuevaFacturaAPagar() {

    }

    @Override
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero) {
        return false;
    }

    @Override
    public void darDeBajaServicio(int idContratacion) {
    }

    //Getters
    public PersonaFisica getPersonaFisica() {
        return personaFisica;
    }

    //Setters
    public void setPersonaFisica(PersonaFisica personaFisica) {
        this.personaFisica = personaFisica;
    }
}
