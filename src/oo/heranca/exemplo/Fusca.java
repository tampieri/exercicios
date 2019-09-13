package oo.heranca.exemplo;

public class Fusca extends Carro implements Esportivo {

	public Fusca() {
		this(110);
	}
	
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(10);
	}

	@Override
	public void ligarTurbo() {
		setDelta(20);
		
	}

	@Override
	public void desligarTurbo() {
		setDelta(10);
		
	}
}
