package modelo;

import java.util.ArrayList;

public class SinContratacionState implements IState{
    private PersonaFisica personaFisica;

    //Constructor
    public SinContratacionState(PersonaFisica personaFisica){
        this.personaFisica = personaFisica;
    }

    //Metodos
    @Override
    public void nuevaFacturaAPagar() {

    }

    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasAPagar() {
    	ArrayList<ResumenFactura> arregloResumen = new ArrayList<>();
        for(int i = 0; i < personaFisica.getFacturasAPagar().size(); i++){
            ResumenFactura resumen = new ResumenFactura(personaFisica.getFacturasAPagar().get(i), personaFisica.getFacturasAPagar().get(i).calcular());
            arregloResumen.add(resumen);
        }
        return arregloResumen;
    }

    @Override
    public void pagarFactura(IFactura factura) {
        
    }

    @Override
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id) {
        boolean res = this.personaFisica.getFacturaDelMes().contratarServicio(tipoContratacion,tipoPromocion, cantidadBotones,cantidadCamaras,tieneMovil,calle,numero,id);
        if(res){
            this.personaFisica.setEstado(new ConContratacionState(this.personaFisica));
        }
        return res;
    }

    @Override
    public void darDeBajaServicio(int idContratacion) {
    }

    public void setPersonaFisica(PersonaFisica personaFisica) {
        this.personaFisica = personaFisica;
    }

    public PersonaFisica getPersonaFisica(){
        return personaFisica;
    }
}
