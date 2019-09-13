package oo.heranca.exemplo;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta;

	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		velocidadeAtual += getDelta();
	}
	
	void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
