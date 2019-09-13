package oo.polimorfismo;

public class Almoco {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(80.50);
		
		Arroz comida1 = new Arroz(0.3);
		Feijao comida2 = new Feijao(0.2);
		//Erro classe abstrata
		//Comida comida3 = new Comida(0.1);
		Comida comida3 = new Arroz(0.1);
		Sorvete sobremesa1 = new Sorvete(0.1);
		
		System.out.println(p1.getPeso());
		
		p1.comer(comida1);
		p1.comer(comida2);
		p1.comer(comida3);
		System.out.println(p1.getPeso());
		
		p1.comer(sobremesa1);
		System.out.println(p1.getPeso());
		
		
	}

}
