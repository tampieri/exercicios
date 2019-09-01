package controle;

public class For {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 20; contador+=2) {
			System.out.println("valor do contador: " + contador);
		}
		
		int x = 1;
		for (;x < 10;) {
			System.out.println("valor do x: " + x);
			x++;
		}
		
		//Laço infinito
		/*
		 * for (;;) { System.out.println("infinito"); }
		 */
		
		
	}
}
