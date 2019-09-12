package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Higor;

public class Daniel extends Higor {



	void testeAcessos() {
		//testando o acesso via herança
		//Higor irmao = new Higor();
		
		//privado
		//System.out.println(esposa.segredo);
		//Acesso somente dentro do mesmo pacote
		//System.out.println(irmao.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
