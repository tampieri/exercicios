package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco = 1000.00;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Lapis";
		p2.preco = 1.00;
		p2.desconto = 0.30;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco *(1 - p1.desconto);
		double precoFinal2 = p2.preco *(1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}

}
