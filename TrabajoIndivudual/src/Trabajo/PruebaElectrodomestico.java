package Trabajo;

public class PruebaElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Electrodomestico tienda[] = new Electrodomestico[10];
	
	Electrodomestico lavadora = new Electrodomestico (200, "Lila",'F',25);
		System.out.println(lavadora.toString());
 		System.out.println(lavadora.getColor());
 		System.out.println(lavadora.precioFinal(0));
 		tienda[0]= lavadora;

	 Electrodomestico lavadora1 = new Electrodomestico(300,"Gris",'A',5);
	 	System.out.println(lavadora1.toString());
	 	System.out.println(lavadora1.getColor());
	 	System.out.println(lavadora1.precioFinal(0));
		tienda[1] = lavadora1;
	 
	 Electrodomestico lavadora2 = new Electrodomestico(500,"Negro",'F',15);
		System.out.println(lavadora2.toString());
	 	System.out.println(lavadora2.getColor());	
	 
	 Electrodomestico lavadora3 = new Electrodomestico (250, "Celeste", 'B', 20);
	 System.out.println(lavadora3.toString());
	 	System.out.println(lavadora3.getColor());	
	 	tienda[3]= lavadora3;
	 
	 Electrodomestico lavadora4 = new Electrodomestico (250, "Rosado", 'B', 20);
	 	System.out.println(lavadora4.toString());
		System.out.println(lavadora4.getColor());	
		tienda[4]= lavadora4;
	
	 System.out.println(" ");
	 	
	 Electrodomestico television = new Electrodomestico (200, "Morado",'C',10);
	 	System.out.println(television.toString());
	 	System.out.println(television.getColor());
	 	System.out.println(television.precioFinal(0));
	 	tienda[5]= television;
	 
	 Electrodomestico television1 = new Electrodomestico (200, "Morado",'D',10);
	 	System.out.println(television1.toString());
	 	System.out.println(television1.getColor());
	 	System.out.println(television1.precioFinal(0));
	 	tienda[6]= television1;
	 	
	 Electrodomestico television2 = new Electrodomestico (200, "Morado",'E',10);
	 	System.out.println(television2.toString());
	 	System.out.println(television2.getColor());
	 	System.out.println(television2.precioFinal(0));
	 	tienda[7]= television2;
	 	
	 Electrodomestico television3 = new Electrodomestico (200, "Morado",'C',10);
	 	System.out.println(television3.toString());
	 	System.out.println(television3.getColor());
	 	System.out.println(television3.precioFinal(0));
	 	tienda[8]= television3;
	 	
	  Electrodomestico television4 = new Electrodomestico (200, "Morado",'C',10);
	 	System.out.println(television4.toString());
		System.out.println(television4.getColor());
		System.out.println(television4.precioFinal(0));
		tienda[8]= television4;
	 	
	 System.out.println(" ");
	 
	 System.out.println("La suma de los Electrodomestico es: ");
	 
	 

	}

}
