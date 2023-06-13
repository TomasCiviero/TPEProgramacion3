package modelo;


public class ContratacionVivienda extends Contratacion{

    private static final double VALORBASE=8500;

    public ContratacionVivienda(int cantBotones, int cantCamaras, boolean cantMoviles, Domicilio domicilio,int id) {
        super(cantBotones, cantCamaras, cantMoviles,domicilio,id);
    }
    @Override
    public double calcularContratacion() {
        int precioMovil= 0;
        if(super.getCantMoviles()){
            precioMovil = PRECIOMOVIL;
        }
        return VALORBASE+super.getCantBotones()*PRECIOBOTON+super.getCantCamaras()*PRECIOCAMARA+precioMovil;
    }


    @Override
    public void aplicarPromocionPlatino() {
        super.setTotal(calcularContratacion()*0.7);
    }


    @Override
    public void aplicarPromocionDorada() {
        super.setTotal(calcularContratacion()-1500);
    }


}
