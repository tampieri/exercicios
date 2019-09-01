package controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		String cordaCap = "vermelha";
		
		switch (cordaCap.toLowerCase()) {
		case "vermelha":
			System.out.println("Sou Mestre");
		case "marrom":
			System.out.println("Sou contraMestre");
		case "roxo":
			System.out.println("Sou graduado");
		case "verde":
			System.out.println("Sou abaixo de graduado");
		case "azul":
			System.out.println("sou quase graduado");
		case "laranja":
			System.out.println("Sou terceira corda");
		case "amarela":
			System.out.println("Sou segunda corda");
		default:
			System.out.println("ja iniciei");
		}
		
		Scanner entrada = new Scanner(System.in);
			String conceito = "";
			System.out.println("Informe a nota: ");
			int nota = entrada.nextInt();
			
			switch (nota) {
			case 10: case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "C";
				break;
			case 4: case 3:
				conceito = "D";
				break;
			case 2: case 1: case 0:
				conceito = "E";
				break;
			default:
				conceito = "Não informado";
			}
		System.out.println("Conceito é: " + conceito);	
		entrada.close();
		
		
		
	}
}
