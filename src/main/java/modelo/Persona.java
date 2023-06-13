package modelo;

import java.io.Serializable;
import java.util.ArrayList;



public abstract class Persona implements Serializable{

    private  ArrayList<IFactura> facturasAPagar = new ArrayList<>(); //deuda
    private ArrayList<IFactura> facturasPagadas = new ArrayList<>(); //historial
    protected Factura facturaDelMes; //Para crear la factura del mes

    //Lo de run
    private String nombreTecnico;

    //Lo del registro
    protected String contrasenia;
    private String email;
    private String telefono;
    protected String nombre;
    private String Apellido;

    //Metodos

    public abstract ArrayList<ResumenFactura> resumenDeFacturasAPagar();

    public abstract ArrayList<ResumenFactura> resumenDeFacturasPagadas();

    public abstract void darDeBajaServicio(int idContratacion);
    public abstract void pagarFactura(IFactura factura);
    public abstract boolean contratarServicio(String tipoContratacion,String tipoPromocion, int cantidadBotones,int cantidadCamaras,boolean tieneMovil,String calle,String numero,int id);
    //lo de actualizar mes
    public abstract void finDelMes(String metodoPago,int idParaFacturas);

    //Uso polimorfismo para la logica del login
    public abstract int getIdentificacion(); //Si es fisica devuelve dni, y si es juridica devuelve el id
    public abstract void setIdentificacion(int id); //Si es fisica setea dni, y si es juridica setea id

    

    public ArrayList<ResumenContratacion> resumenContratacionesActivas(){
        ArrayList<ResumenContratacion> resumenContratacionesArreglo = new ArrayList<ResumenContratacion>();
        facturaDelMes.getContrataciones().forEach(contratacion -> {
            ResumenContratacion resumenContratacion = new ResumenContratacion(contratacion.getId(),contratacion.getTotal());
            resumenContratacionesArreglo.add(resumenContratacion);
        });
        return resumenContratacionesArreglo;
    }

    //Getters
    public ArrayList<IFactura> getFacturasAPagar() {
        return facturasAPagar;
    }
    public ArrayList<IFactura> getFacturasPagadas() {
        return facturasPagadas;
    }
    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

  

    public Factura getFacturaDelMes() {
        return facturaDelMes;
    }

    //Setters
    public void setFacturaDelMes(Factura facturaDelMes) {
        this.facturaDelMes = facturaDelMes;
    }

    public void setFacturasAPagar(ArrayList<IFactura> facturasAPagar) {
        this.facturasAPagar = facturasAPagar;
    }


    public void setFacturasPagadas(ArrayList<IFactura> facturasPagadas) {
        this.facturasPagadas = facturasPagadas;
    }


    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}

