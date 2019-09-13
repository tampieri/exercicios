package oo.heranca.exemplo;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Fusca();
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		Uno c2 = new Uno(120);
		c2.ligarTurbo();
		c2.ligarAr();
		
		c2.acelerar();
		System.out.println(c2);		
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);

	}

}
