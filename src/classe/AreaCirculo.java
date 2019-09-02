package classe;

public class AreaCirculo {

	double raio;
	final static double PI = 3.14;
	
	public AreaCirculo(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
