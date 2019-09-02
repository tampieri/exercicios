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
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	public double precoComDesconto(double descontoAuxiliar) {
		return preco * (1 - desconto + descontoAuxiliar);
	}	
}
