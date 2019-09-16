package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExemplo1 {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		
		Integer total = lista.parallelStream().reduce(soma).get();
		System.out.println(total);
		
		Integer total2 = lista.stream().reduce(100, soma);
		System.out.println(total2);
		
		lista.stream()
			.filter(n -> n > 1)
			.reduce(soma)
			.ifPresent(System.out::println);
	}

}
