package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MimMax {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Higor", 1.86);
		Pessoa p2 = new Pessoa("Eloisa", 1.59);
		Pessoa p3 = new Pessoa("Samara", 1.0);
		Pessoa p4 = new Pessoa("Daniel", 1.92);
		Pessoa p5 = new Pessoa("Chris", 1.65);
		Pessoa p6 = new Pessoa("Pedro", 1.20);
		
		List<Pessoa> lista = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Comparator<Pessoa> alto = (a1, a2) -> {
			if(a1.tamanho > a2.tamanho) return 1;
			if(a1.tamanho < a2.tamanho) return -1;
			return 0;
		};
		
		System.out.println(lista.stream().max(alto).get());
		System.out.println(lista.stream().min(alto).get());

	}

}
