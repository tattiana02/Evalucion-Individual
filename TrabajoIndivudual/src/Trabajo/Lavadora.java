package Trabajo;

public class Lavadora extends Electrodomestico{
	
	String carga;

	public Lavadora(int precioBase, String color, String consumoEnergetico, int peso, String carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public String getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	public void precioFinal() {
		
	}		
}
