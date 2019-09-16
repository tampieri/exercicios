package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceExemplo2 {

	public static void main(String[] args) {

		double media = 1.70;
		
		Pessoa p1 = new Pessoa("Higor", 1.86);
		Pessoa p2 = new Pessoa("Eloisa", 1.59);
		Pessoa p3 = new Pessoa("Samara", 1.0);
		Pessoa p4 = new Pessoa("Daniel", 1.92);
		Pessoa p5 = new Pessoa("Chris", 1.65);
		Pessoa p6 = new Pessoa("Pedro", 1.20);
		
		List<Pessoa> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Pessoa> alto = a -> a.tamanho >= media;
		Function<Pessoa, Double> apenasAltura = a -> a.tamanho;
		BinaryOperator<Double> soma = (a, b) -> a + b;
		
		lista.stream()
			.filter(alto)
			.map(apenasAltura)
			.reduce(soma)
			.ifPresent(System.out::println);
	}

}
