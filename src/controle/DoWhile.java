package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String valorTxt = "";
		do {
			System.out.println("Digite a palavra correta...");
			System.out.print("Deseja sair? ");
			valorTxt = entrada.nextLine();
		} while (!valorTxt.equalsIgnoreCase("sim"));
		
		System.out.println("Ok você saiu.");
		entrada.close();
	}
}
