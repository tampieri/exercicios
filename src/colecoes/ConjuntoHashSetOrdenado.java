package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHashSetOrdenado {

	public static void main(String[] args) {

		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();

		lista.add("higor");
		lista.add("samara");
		lista.add("eloisa");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		Set<Integer> lista2 = new HashSet<>();

		lista2.add(2);
		lista2.add(1);
		lista2.add(3);
		
		for (Integer num : lista2) {
			System.out.println(num);
		}

	}

}
