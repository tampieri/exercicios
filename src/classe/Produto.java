package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	public Produto() {
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	/*
	 * Produto(String nomeInicial, double precoInicial){ nome = nomeInicial; preco =
	 * precoInicial; }
	 */
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
	
	public double precoComDesconto(double descontoAuxiliar) {
		final double descontoSomado = desconto + descontoAuxiliar;
		return preco * (1 - descontoSomado);
	}
	
	double descontoSomado = desconto + 0.10;
}
