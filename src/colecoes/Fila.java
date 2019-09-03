package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		//add e offer adiciona elementos na fila
		//sua diferença ocorre quando a fila ta cheia
		fila.add("Higor"); // retorna false
		fila.offer("Samara"); //lança uma exceção
		fila.add("Eloisa");
		fila.add("Nina");
		fila.add("Maia");
		
		//peek e element obtem elementos da fila sem remover
		//sua diferença ocorre quando a fila ta vazia
		System.out.println(fila.peek());// retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		//Limpar Fila
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		System.out.println(fila.poll());// retorna false em caso de fila vazia
		System.out.println(fila.remove());//lança uma exceção em caso de fila vazia
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		
	}

}
