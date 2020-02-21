package Trabajo;

public class Electrodomestico {

	int precioBase;
	String color;
	String consumoEnergetico;
	int peso;
	
	Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso){
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}
	
	static final void precioBase() {
		
	}
	

	static final void Peso(){
		
	}
	
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	public void comprobarConsumoEnergetico(char letra){
		
	}
		
	public void comprobarColor(String color){
		
	}
	
	public void precioFinal() {
		
	}		
	
}
