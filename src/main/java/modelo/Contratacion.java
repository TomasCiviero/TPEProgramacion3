package modelo;

import java.io.Serializable;

public abstract class Contratacion implements Promocionable,Serializable{
    private Domicilio domicilio;
    private int id;
    private int cantBotones;
    private int cantCamaras;
    private boolean cantMoviles;
    protected static final int PRECIOBOTON=2000;
    protected static final int PRECIOCAMARA=3000;
    protected static final int PRECIOMOVIL=7500;
    private double total;


    public Contratacion(int cantBotones, int cantCamaras, boolean cantMoviles, Domicilio domicilio,int id) {
    	this.id = id;
        this.cantBotones = cantBotones;
        this.cantCamaras = cantCamaras;
        this.cantMoviles = cantMoviles;
        this.domicilio=domicilio;
    }



    public int getCantBotones() {
        return cantBotones;
    }
    public int getCantCamaras() {
        return cantCamaras;
    }
    public boolean getCantMoviles() {
        return cantMoviles;
    }
    public double getTotal() {
        return total;
    }
    public int getId() {
        return id;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }


    public void setTotal(double total) {
        this.total = total;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCantBotones(int cantBotones){
        this.cantBotones= cantBotones;
    }

    public void setCantCamaras(int cantCamaras){
        this.cantCamaras = cantCamaras;
    }

    public void setCantMoviles(boolean cantMoviles){
        this.cantMoviles = cantMoviles;
    }


    public abstract double calcularContratacion();


}
