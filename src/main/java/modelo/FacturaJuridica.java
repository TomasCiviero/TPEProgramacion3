package modelo;


public class FacturaJuridica extends Factura {


    public FacturaJuridica(){

    }

    @Override
    public double calcular() {
        double suma = 0;
        for(int i = 0; i <super.getContrataciones().size(); ++i){
            if(i>=2)
                suma += super.getContrataciones().get(i).getTotal()*0.5;
            else
                suma += super.getContrataciones().get(i).getTotal();
        }
        return suma;
    }

  

}

