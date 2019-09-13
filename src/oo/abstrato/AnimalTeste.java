package oo.abstrato;

public class AnimalTeste {

	public static void main(String[] args) {
		Mamifero a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.alimentar());
		System.out.println(a.respirar());
	}

}
