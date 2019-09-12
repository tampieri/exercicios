package oo.heranca;

public class jogador {

	int x;
	int y;
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			y--;
			break;
		}
		return true;		
	}
}
