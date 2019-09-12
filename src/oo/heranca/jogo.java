package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10, 10);
		
		Monstro monstro = new Monstro();
		
		System.out.println("Heroi tem  = " + heroi.vida + " vida");
		System.out.println("Monstro tem  = " + monstro.vida + " vida");
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Heroi tem  = " + heroi.vida + " vida");
		System.out.println("Monstro tem  = " + monstro.vida + " vida");
	}

}
