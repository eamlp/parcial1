package logica;

public class Poligono4 {
	private Punto a;
	private Punto b;
	private Punto c;
	private Punto d;

	public Poligono4(Punto a, Punto b, Punto c, Punto d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Punto getA() {
		return a;
	}

	public void setA(Punto a) {
		this.a = a;
	}

	public Punto getB() {
		return b;
	}

	public void setB(Punto b) {
		this.b = b;
	}

	public Punto getC() {
		return c;
	}

	public void setC(Punto c) {
		this.c = c;
	}

	public Punto getD() {
		return d;
	}

	public void setD(Punto d) {
		this.d = d;
	}

	public double calcularPerimetro() {
		double ladoAB = Util.calcularDistancia(a, b);
		double ladoBC = Util.calcularDistancia(b, c);
		double ladoCD = Util.calcularDistancia(c, d);
		double ladoDA = Util.calcularDistancia(d, a);
		return ladoAB + ladoBC + ladoCD + ladoDA;
	}

	public double calcularArea() {
		double ladoAB = Util.calcularDistancia(a, b);
		double ladoBC = Util.calcularDistancia(b, c);
		double ladoCD = Util.calcularDistancia(c, d);
		double ladoDA = Util.calcularDistancia(d, a);

		double diagonal = Util.calcularDistancia(a, c);

		double s1 = (ladoAB + ladoBC + diagonal) / 2d;
		double area1 = Math.sqrt(s1 * (s1 - ladoAB) * (s1 - ladoBC) * (s1 - diagonal));

		double s2 = (ladoCD + ladoDA + diagonal) / 2d;
		double area2 = Math.sqrt(s2 * (s2 - ladoCD) * (s2 - ladoDA) * (s2 - diagonal));

		return area1 + area2;
	}

	public boolean esCuadrado(){
		double ladoAB = Util.calcularDistancia(a, b);
		double ladoBC = Util.calcularDistancia(b, c);
		double ladoCD = Util.calcularDistancia(c, d);
		double ladoDA = Util.calcularDistancia(d, a);
		
		double diagonal = Util.calcularDistancia(a, c);
		double diagonal2 = Util.calcularDistancia(b, d);
		
		return ladoAB==ladoBC && ladoBC==ladoCD && ladoCD == ladoDA && diagonal==diagonal2;  
	}

}
