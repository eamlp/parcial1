package logica;

public class Principal {

	public static void main(String[] args) {
		Punto a = new Punto(0, 0);
		Punto b = new Punto(4, 6);
		Punto c = new Punto(0, 8);
		Punto d = new Punto(4, -6);
		
		Poligono4 miPoligono4=new Poligono4(a, b, c, d);
		System.out.println("Perimetro: "+miPoligono4.calcularPerimetro());
		System.out.println("Area: "+miPoligono4.calcularArea());
		if(miPoligono4.esCuadrado()){
			System.out.println("Es cuadrado");
		} else {
			System.out.println("No es cuadrado");
		}

	}

}
