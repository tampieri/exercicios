package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "Higor";
		c1.adicionaItem(new Item("Lapis", 10, 1.50));
		c1.adicionaItem(new Item("Caneta", 5, 2.50));
		c1.adicionaItem(new Item("Caderno", 2, 10.50));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.ObterValorTotal());
	}

}
