package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;//Atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Produto p1 = new Produto("caneta", 2.00, 0.0);
		Produto p2 = p1;//Atribuição por referencia (Objeto)
		
		p1.desconto = 0.10;
		p2.preco = 3.00;
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		voltarValorProduto(p1);
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		int c = 10;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarValorProduto(Produto prod) {
		prod.preco = 1.00;
		prod.desconto = 0.00;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
