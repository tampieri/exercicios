package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("..."));
		
		Produto p = Math.random() > 0.5 ? new Produto() : null;
		
		if (p != null) {
			p.desconto = 0.3;
			System.out.println(p.precoComDesconto());
		}
		
		String s2 = Math.random() < 0.5 ? "OK" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("!!!"));
		}
	}
}
