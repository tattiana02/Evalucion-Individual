package Trabajo;

public class Lavadora extends Electrodomestico{
	
	private int carga;

	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	public double precioFinal(String precio) {
	    double monto = super.precioFinal(carga);
        if (carga > 30 ) {
            monto += 50;
        }
        return monto;
    }	
}
