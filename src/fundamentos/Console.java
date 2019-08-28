package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia\n");

		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("numeros: %d %d %d %n", 1, 2, 3);
		System.out.printf("Salario: %.2f%n", 6000.123);
		System.out.printf("Nome: %s%n", "Higor");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
				
		System.out.println("Nome: " + nome + " " + sobrenome + " Idade: " + idade);
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}

}
