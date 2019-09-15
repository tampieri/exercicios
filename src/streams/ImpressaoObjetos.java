package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImpressaoObjetos {

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("Higor", "Eloisa", "Samara", "Nina", "Maia");
		
		System.out.println("Foreach");
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println("Iterator");
		Iterator<String> list = lista.iterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		System.out.println("Stream");
		Stream<String> stream = lista.stream();
		stream.forEach(System.out::println);
		
		
	}
}
