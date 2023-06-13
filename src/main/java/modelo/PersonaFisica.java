package modelo;

import java.util.ArrayList;

import concurrencia.Tecnicos;

/**
 * <br>
 * Clase concreta que sirve para representar los datos de una
 * Persona fisica
 */
public class PersonaFisica extends Persona implements Runnable{
    private int dni;
    private IState estado;
    private Tecnicos tecnicos;

    //Constructor
    public PersonaFisica(int dni) {
        this.dni = dni;
        this.estado = new SinContratacionState(this);
        this.facturaDelMes = new FacturaFisica();
    }
    public PersonaFisica(){

    }
    
    public PersonaFisica(int dni, Tecnicos tecnicos,String nombre) {
		this.dni = dni;
		this.tecnicos = tecnicos;
		this.nombre=nombre;
	}
    
	//Metodos

    @Override
    public void run() {
        this.tecnicos.agarrarTecnico(this);
        Util.espera();
        this.tecnicos.devolverTecnico(this);
        Util.espera();
    }
    @Override
    public ArrayList<ResumenFactura> resumenDeFacturasAPagar() {
        return this.estado.resumenDeFacturasAPagar();
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

    public void nuevaFacturaAPagar(){
        this.estado.nuevaFacturaAPagar();
    }
    @Override
    public void pagarFactura(IFactura factura){
        this.estado.pagarFactura(factura);
    }
    @Override
    public boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero){
        return this.estado.contratarServicio(tipoContratacion,tipoPromocion,cantidadBotones,cantidadCamaras,tieneMovil,calle,numero);
    }
    @Override
    public void darDeBajaServicio(int idContratacion){
        this.estado.darDeBajaServicio(idContratacion);
    }
    @Override
    public void finDelMes(String metodoPago) {
    	if(getFacturaDelMes().getContrataciones().size()>0) {
    		//calendar=calendar.plusMonths(1);
    		System.out.println(getFacturasAPagar().size());
            DecoratorMetodoDePagoFactory decFac = new DecoratorMetodoDePagoFactory();
            
            IFactura facturaFinalDelMes = decFac.crearDecoratorMetodoDepago(metodoPago,facturaDelMes);
            
            // facturaFinalDelMes.setCalendar(calendar);
            getFacturasAPagar().add(facturaFinalDelMes);
            estado.nuevaFacturaAPagar();
            Factura facAux = facturaDelMes;
            
            facturaDelMes = null;
            facturaDelMes = new FacturaFisica();
            for(int i = 0; i < facAux.getContrataciones().size(); ++i){
                facturaDelMes.getContrataciones().add(facAux.getContrataciones().get(i));
            }
    	}
    }

    //polimorfismo para la logica del login
    @Override
    public int getIdentificacion() {
        return this.dni;
    }

    //Getter
    public int getDni() {
        return dni;
    }
    public IState getEstado(){ //SOLO PORQUE ES PERSISTENCIA XML, STATE NO DEBERIA SER VISIBLE
        return estado;
    }


    //Setters
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setEstado(IState estado) {
        this.estado = estado;
    }
    @Override
    public void setIdentificacion(int id) {
        this.dni = id;
    }

    //toString para mostrar el nombre de la persona en la concurrencia. (NO borrar)
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Dni:" + dni ;
    }
	public Tecnicos getTecnicos() {
		return tecnicos;
	}
	public void setTecnicos(Tecnicos tecnicos) {
		this.tecnicos = tecnicos;
	}
    
}
