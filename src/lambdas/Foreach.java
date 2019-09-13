package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Higor", "Eloisa", "Samara", "Nina", "Maia");
		
		System.out.println("Foreach comum");
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println("\nForeach com lambda");
		lista.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nMethod reference");
		lista.forEach(System.out::println);
		
		System.out.println("\nForeach com lambda2");
		lista.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethod reference2");
		lista.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("O nome é: " + nome);
	}

}
