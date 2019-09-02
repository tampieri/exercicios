package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		var p1 = new Produto();
		p1.nome = "Lapis";
		p1.preco = 1.00;
		p1.desconto = 0.30;
		
		Produto p2 = new Produto("notebook");
		p2.preco = 1000.00;
		p2.desconto = 0.25;
				
		Produto p3 = new Produto("penDrive", 25.65);
		p3.desconto = 0.25;
		
		Produto p4 = new Produto("Impressora", 250.65, 0.20);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		System.out.println(p4.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto(0.1);
		double precoFinal4 = p4.precoComDesconto(0.11);
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4) / 4;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}

}
