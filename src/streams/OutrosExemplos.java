package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosExemplos {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Higor", 1.86);
		Pessoa p2 = new Pessoa("Eloisa", 1.59);
		Pessoa p3 = new Pessoa("Samara", 1.0);
		Pessoa p4 = new Pessoa("Daniel", 1.92);
		Pessoa p5 = new Pessoa("Chris", 1.65);
		Pessoa p6 = new Pessoa("Pedro", 1.20);
		Pessoa p7 = new Pessoa("Daniel2", 1.93);
		Pessoa p8 = new Pessoa("Chris", 1.65);
		Pessoa p9 = new Pessoa("Pedro", 1.20);
		
		List<Pessoa> lista = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		
		System.out.println("Distinct");
		lista.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/limit");
		lista.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		lista.stream()
			.distinct()
			.takeWhile(a -> a.tamanho >= 1.50)
			.forEach(System.out::println);

	}

}
