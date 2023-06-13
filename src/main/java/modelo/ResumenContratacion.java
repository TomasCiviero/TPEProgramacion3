package modelo;

import java.io.Serializable;

public class ResumenContratacion  implements Serializable{

    private int id;
    private double total;

    public ResumenContratacion(int id, double total){
        this.id = id;
        this.total = total;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "[id=" + id + ", total=" + String.format("%.2f",total) + "]";
	}
    
}

