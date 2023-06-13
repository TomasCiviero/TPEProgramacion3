package modelo;

/**
 * <br>
 * Clase que representa una contratacion dentro de la empresa.
 * Contiene el valor de cada añadido y el valor total
 */
public abstract class Contratacion implements Promocionable, Cloneable{
    private Domicilio domicilio;
    private int id;
    private static int sigId = 0;
    private int cantBotones;
    private int cantCamaras;
    private boolean cantMoviles;
    protected static final int PRECIOBOTON=2000;
    protected static final int PRECIOCAMARA=3000;
    protected static final int PRECIOMOVIL=7500;
    private double total;


    /**
     * Constructor con tres parametros int para setear la contratacion
     * A la vez, inicializa el ID único para cada Contratación
     * <b>Pre:</b> la cantidad de botones,camaras y moviles debe ser
     * mayor o igual a 0. Y domicilio tiene que ser distinto de null
     *
     * @param cantBotones Cantidad de botones de la contratacion
     * @param cantCamaras Cantidad de camaras de la contratacion
     * @param cantMoviles Cantidad de moviles de la contratacion
     * @param domicilio Domicilio de la contratacion
     */
    public Contratacion(int cantBotones, int cantCamaras, boolean cantMoviles, Domicilio domicilio) {
        this.id = sigId;
        this.cantBotones = cantBotones;
        this.cantCamaras = cantCamaras;
        this.cantMoviles = cantMoviles;
        this.domicilio=domicilio;
        sigId = sigId + 1;
    }

    public Contratacion(){

    }

    //Getters
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

    //Setters
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

    //Metodos

    /**
     * Metodo abstracto que calcula la contratacion
     * @return El valor final de la contratacion
     */
    public abstract double calcularContratacion();

    /**
     * Metodo sobreescrito de la clase object, que clona una contratacion
     * @return La referencia a la contratacion clonada.
     */
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    };
}