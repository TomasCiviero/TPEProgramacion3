package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * <br>
 * Clase que representa a una Empresa de contrataciones
 * Contiene los metodos de la empresa.
 */
public class Empresa {
    private static Empresa instance;
    private String nombre;
    private HashMap<Integer,Persona> abonados = new HashMap<Integer,Persona>();

	//Metodos
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
        return abonado.contratarServicio(tipoContratacion,tipoPromocion,cantidadBotones,cantidadCamaras,tieneMovil,calle,numero);
    }


    public void finDelMes(Persona abonado,String metodoPago){
        abonado.finDelMes(metodoPago);
    }

    public boolean registrar(int id, String contrasenia, String email, String telefono, String nombre, String apellido,String tipoPersona){
        boolean exito = false;
        if (!abonados.containsKey(id)) {
            Persona nuevoUsuario=null;
            PersonaFactory personaFactory = new PersonaFactory();
            nuevoUsuario = personaFactory.crearPersona(tipoPersona,id);

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

/*    public void pedirTecnico(Persona persona){
        Thread usuario1= new Thread(new PersonaFisica(4012345));
        Thread usuario2= new Thread(new PersonaFisica(3095688));
        Thread usuario3= new Thread(new PersonaFisica(2742139));
        Thread usuario4= new Thread(persona); // este seria usuario que pidio
        Thread usuario5= new Thread(new PersonaFisica(1234567));
        Thread usuario6= new Thread(new PersonaFisica(5023412));

        usuario1.start();
        usuario2.start();
        usuario3.start();
        usuario4.start();
        usuario5.start();
        usuario6.start();
    }*/


    //Constructor privado
    private Empresa(){
    	Persona persona=new PersonaFisica(5);
    	persona.setContrasenia("a");
    	abonados.put(5,persona);
    }

    //Singleton
    public static Empresa getInstance(){
        if(instance == null){
            instance = new Empresa();
        }
        return instance;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public HashMap<Integer, Persona> getAbonados() {
        return abonados;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAbonados(HashMap<Integer,Persona> abonados){
        this.abonados = abonados;
    }

}
