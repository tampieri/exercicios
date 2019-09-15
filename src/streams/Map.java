package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		//Consumer<Integer> println = System.out::println;
		
		List<String> lista = Arrays.asList("higor ", "eloisa ", "samara ", "nina ", "maia ");
		
		lista.stream().map(list -> list.toUpperCase()).forEach(print);
		
		System.out.println("\n\nUsando Composição");
		lista.stream()
			.map(UnaryUtils.maiuscula)
			.map(UnaryUtils.primeiraLetra)
			.map(UnaryUtils::grito)			
			.forEach(print);

	}

}
