package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double Fa = 86;
		double Ce;
		final double ajuste = 32.0;
		final double fator = 5/9.0;
		
		Ce = (Fa - ajuste) * fator;
		System.out.println("A temperatura em Celsius é: " + Ce);

	}

}
