package modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class ResumenFactura  implements Serializable{
    private IFactura factura;
    private double precio;

    //Constructor
    public ResumenFactura(IFactura factura, double precio) {
        this.factura = factura;
        this.precio = precio;
    }

    public IFactura getFactura() {
        return factura;
    }

    public void setFactura(IFactura factura) {
        this.factura = factura;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
	@Override
	public String toString() {
		return "[ "  + "Precio= $" + String.format("%.2f",precio)+" ]";
	}
    
}
