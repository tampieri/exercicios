package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Computador", 1500.00, 0.1);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Impressora", 500.00, 0.2);
		Produto p3 = new Produto("Mouse", 50.00, 0.3);
		Produto p4 = new Produto("Monitor", 450.00, 0.4);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
