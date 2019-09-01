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
		
		//For decremento
		for (int contador2 = 20; contador2 >= 0; contador2-=2) {
			System.out.println("valor do contador 2: " + contador2);
		}
		
		//for dentro de outro for
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d %d", i, j);
			}
			System.out.println();
		}
		
		
	}
}
