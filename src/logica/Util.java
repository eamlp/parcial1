package logica;

public class Util {

	public static double calcularDistancia(Punto punto1, Punto punto2) {
		return Math.sqrt(Math.pow(punto1.getX() - punto2.getX(), 2) + Math.pow(punto1.getY() - punto2.getY(), 2));
	}
}