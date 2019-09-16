package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {

		double alturaBase = 1.70;
		
		Pessoa p1 = new Pessoa("Higor", 1.86);
		Pessoa p2 = new Pessoa("Eloisa", 1.59);
		Pessoa p3 = new Pessoa("Samara", 1.0);
		Pessoa p4 = new Pessoa("Daniel", 1.92);
		Pessoa p5 = new Pessoa("Chris", 1.65);
		Pessoa p6 = new Pessoa("Pedro", 1.20);
		
		List<Pessoa> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Pessoa> alto = a -> a.tamanho >= alturaBase;
		Predicate<Pessoa> baixo = alto.negate();
		
		System.out.println(lista.stream().allMatch(alto));
		System.out.println(lista.stream().anyMatch(alto));
		System.out.println(lista.stream().noneMatch(alto));
		System.out.println(lista.stream().noneMatch(baixo));

	}

}
