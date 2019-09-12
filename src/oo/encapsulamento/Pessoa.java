package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(int idade, String nome, String sobrenome) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		
	}

	//getter
	public int getIdade() {
		return idade;
	}

	//setter
	public void setIdade(int idade) {
		idade =Math.abs(idade);
		if(idade >= 0 && idade <= 130) {
			this.idade = idade;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome().concat(" ").concat(getSobrenome());
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome= " + getNome() +" " + getSobrenome() + "]" +"[idade= " + getIdade() + "]";
	}

	
}
