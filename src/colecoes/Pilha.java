package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Pequena Sereia");
		livros.add("Pepa pig");
		livros.add("Show da luna");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		//System.out.println(livros.remove());
		
		//livros.clear();
		//livros.isEmpty();
		//livros.contains(...);
	}

}
