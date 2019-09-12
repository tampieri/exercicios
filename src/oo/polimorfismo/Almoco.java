package oo.polimorfismo;

public class Almoco {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(80.50);
		
		Arroz comida1 = new Arroz(0.300);
		Feijao comida2 = new Feijao(0.200);
		Sorvete sobremesa1 = new Sorvete(0.100);
		
		System.out.println(p1.getPeso());
		
		p1.comer(comida1);
		p1.comer(comida2);
		System.out.println(p1.getPeso());
		
		p1.comer(sobremesa1);
		System.out.println(p1.getPeso());
		
		
	}

}
