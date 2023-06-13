package modelo;

import java.time.LocalDate;

public class ResumenFactura {
    private IFactura factura;
    private double precio;
    private int id;

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
		return "[ "  + "Precio= $" + precio + "  Fecha: Año: ";
	//+factura.getCalendar().getYear()+"  Mes: "+factura.getCalendar().getMonthValue()+"  Dia: "+factura.getCalendar().getDayOfMonth()+" ]";
	}
    
}
