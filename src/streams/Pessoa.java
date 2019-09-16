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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(tamanho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(tamanho) != Double.doubleToLongBits(other.tamanho))
			return false;
		return true;
	}
	
	
}
