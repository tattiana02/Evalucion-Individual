package Trabajo;

public class Television extends Electrodomestico{
	
	int resolucion; 
	boolean sintonizadorTDT;

	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT; 
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public String toString() {
		return "Television [resolución=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "]";
	}
	
	/*public boolean sintonizadorTDT() {
		boolean retorno = false;
		if (this.sintonizadorTDT() >=20) {
			retorno = true;
		}
		return retorno;
	}*/
	
	public double precioFinal( ) {
		  double monto = super.precioFinal(resolucion);
	        if (resolucion >= 40 ) {
	            monto += precioBase*0.3;
	        }
	        return monto;
	   }
}	
	
