package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar =
			numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> resultado =
			valor -> "Resultado é: " + valor;
		
		Function<String, String> confirmado =
			valor -> valor + " OK";
				
		String resultadoFinal = parOuImpar
				.andThen(resultado)
				.andThen(confirmado)
				.apply(5);
		
		System.out.println(parOuImpar.apply(3));
		System.out.println(parOuImpar.apply(2));
		System.out.println(resultadoFinal);
	
	}

}
