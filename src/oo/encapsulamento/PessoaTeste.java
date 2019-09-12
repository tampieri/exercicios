package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(-40, "Higor", "Tampieri");
		//p1.idade = -39;//alterando valor
		p1.setIdade(-39);
		
		//System.out.println(p1.idade);//lendo o valor
		System.out.println(p1.getIdade());//lendo o valor
		System.out.println(p1);//lendo o valor
		System.out.println(p1.getNomeCompleto());//lendo o valor


	}

}
