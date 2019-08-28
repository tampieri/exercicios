package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola Mundo".charAt(0));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Samara";
		var sobrenome = "Tampieri";
		var idade = 2;
		var numero = 123.23;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nNumero: " + numero);
		
		System.out.printf("A criança %s %s tem %d anos e seu numero é %f", nome, sobrenome, idade, numero);
		
		String frase = String.format("\nA criança %s %s tem %d anos e seu numero é %.2f", nome, sobrenome, idade, numero);
		System.out.println(frase);
		
		System.out.println("frase aleatoria".contains("ale"));
		System.out.println("frase aleatoria".indexOf("ale"));
		System.out.println("frase aleatoria".substring(6));
		System.out.println("frase aleatoria".substring(6,8));
	}

}
