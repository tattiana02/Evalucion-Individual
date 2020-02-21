package Trabajo;

public class Television extends Electrodomestico{
	
	int resoluci�n; 
	boolean sintonizadorTDT;

	public Television(int precioBase, String color, String consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resoluci�n = resolucion;
		this.sintonizadorTDT = sintonizadorTDT; 
	}
	
	public int getResoluci�n() {
		return resoluci�n;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public String toString() {
		return "Television [resoluci�n=" + resoluci�n + ", sintonizadorTDT=" + sintonizadorTDT + "]";
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
