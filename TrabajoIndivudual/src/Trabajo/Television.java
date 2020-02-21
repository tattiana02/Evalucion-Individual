package Trabajo;

public class Television extends Electrodomestico{
	
	int resolución; 
	boolean sintonizadorTDT;

	public Television(int precioBase, String color, String consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolución = resolucion;
		this.sintonizadorTDT = sintonizadorTDT; 
	}
	
	public int getResolución() {
		return resolución;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public String toString() {
		return "Television [resolución=" + resolución + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}
	
	/*public boolean sintonizadorTDT() {
		boolean retorno = false;
		if (this.sintonizadorTDT() =20) {
			retorno = true;
		}
		return retorno;
	}*/
	
	public void precioFinal() {
		
	}	
	
}
