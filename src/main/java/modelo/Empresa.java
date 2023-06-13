package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.IntToDoubleFunction;


public class Empresa implements Serializable{
    private static Empresa instance;
    private HashMap<Integer,Persona> abonados = new HashMap<Integer,Persona>();
    private int idParaContrataciones = 0;
    private int idParaFacturas = 0;

    public ArrayList<ResumenFactura> resumenDeFacturasAPagar(Persona abonado){
        return abonado.resumenDeFacturasAPagar();
    }

    public ArrayList<ResumenFactura> resumenDeFacturasPagadas(Persona abonado){
        return abonado.resumenDeFacturasPagadas();
    }

    public void agregarAbonado(Persona abonado) {
        this.abonados.put(abonado.getIdentificacion(),abonado);
    }

    public void darDeBajaServicio(Persona abonado,ResumenContratacion contratacion){
        abonado.darDeBajaServicio(contratacion.getId());
    }

    public void pagarFactura(Persona abonado, ResumenFactura factura){
        abonado.pagarFactura(factura.getFactura());
    }

    public boolean contratarServicio(Persona abonado,String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero){
        return abonado.contratarServicio(tipoContratacion,tipoPromocion,cantidadBotones,cantidadCamaras,tieneMovil,calle,numero,idParaContrataciones++);
    }


    public void finDelMes(Persona abonado,String metodoPago){
        abonado.finDelMes(metodoPago,idParaFacturas++);
    }

    public boolean registrar(int id, String contrasenia, String email, String telefono, String nombre, String apellido,String tipoPersona){
        boolean exito = false;
        if (!abonados.containsKey(id)) {
            Persona nuevoUsuario=null;
            PersonaFactory personaFactory = new PersonaFactory();
            nuevoUsuario = personaFactory.crearPersona(tipoPersona,id,idParaFacturas);

            nuevoUsuario.setIdentificacion(id);
            nuevoUsuario.setContrasenia(contrasenia);
            nuevoUsuario.setEmail(email);
            nuevoUsuario.setTelefono(telefono);
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setApellido(apellido);
            abonados.put(id,nuevoUsuario);
            exito = true;
        }
        return exito;
    }


    public Persona ingresar(int id, String contrasenia){
        if (abonados.containsKey(id) ){
            if (abonados.get(id).getContrasenia().equals(contrasenia))
                return abonados.get(id);
            else
                return null;
        }
        else
            return null;
    }

    public ArrayList<ResumenContratacion> resumenContratacionesActivas(Persona abonado){
        return abonado.resumenContratacionesActivas();
    }


    private Empresa(){
    	Persona persona=new PersonaFisica(5,idParaFacturas);
    	persona.setContrasenia("a");
    	abonados.put(5,persona);
    }


    public static Empresa getInstance(){
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }

    public HashMap<Integer, Persona> getAbonados() {
        return abonados;
    }

    public void setAbonados(HashMap<Integer,Persona> abonados){
        this.abonados = abonados;
    }

	public int getIdParaContrataciones() {
		return idParaContrataciones;
	}

	public void setIdParaContrataciones(int id) {
		this.idParaContrataciones= id;
	}

    public int getIdParaFacturas() {
        return idParaFacturas;
    }

    public void setIdParaFacturas(int idParaFacturas) {
        this.idParaFacturas = idParaFacturas;
    }
}
