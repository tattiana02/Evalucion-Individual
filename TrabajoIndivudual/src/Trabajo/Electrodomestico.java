package Trabajo;

public class Electrodomestico {

	protected int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
	
	Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso){
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		
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

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
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
	
	private char comprobarConsumoEnergetico(char letra){
		if (letra == 'A'||letra == 'B'||letra == 'C'||letra == 'D'||letra =='E'||letra =='F' ) {
			return letra;
		}else {
			return 'F';
		}
	}
		
	private String comprobarColor(String color){
		if (color.equalsIgnoreCase("Blanco")||color.equalsIgnoreCase("Negro")||color.equalsIgnoreCase("Rojo")
				|| color.equalsIgnoreCase("Azul")||color.equalsIgnoreCase("Gris")) {
			return color;
		}else{
			return "Blanco";
		}	
	}
	
	public double precioFinal(int precio) {
		double precioFinal = 300;
		switch (consumoEnergetico) {
		   case 1:
               precio += 100;
               break;
           case 2:
               precio += 80;
               break;
           case 3:
               precio += 60;
               break;
           case 4:
               precio += 50;
               break;
           case 5:
               precio += 30;
               break;
           case 6:
               precio += 10;
               break;
		}
		  if (peso >= 0 && peso <= 19) {
	            precio += 10;
	        } else if (peso == 20 && peso <= 49) {
	            precio += 50;
	        } else if (peso == 50 && peso <= 79) {
	            precio += 80;
	        }else if (peso > 79) {
	            precio += 100;
	        }
		 return precioFinal + precio;
	}
	
}
