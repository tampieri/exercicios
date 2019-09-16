package streams;

public class Pessoa {

	final String nome;
	final double tamanho;
	
	public Pessoa(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", tamanho=" + tamanho + "]";
	}
}