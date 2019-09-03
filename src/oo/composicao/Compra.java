package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionaItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double ObterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
}
