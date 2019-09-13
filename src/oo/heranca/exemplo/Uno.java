package oo.heranca.exemplo;

public class Uno extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Uno() {
		this(120);
	}
	
	public Uno(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 30;
		}else if(ligarTurbo && ligarAr) {
			return 25;
		}if(!ligarTurbo && ligarAr) {
			return 10;
		}else {
			return 15;
		}
	}
}
