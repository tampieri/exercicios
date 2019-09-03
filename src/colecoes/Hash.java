package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<UsuarioLista> usuarios = new HashSet<UsuarioLista>();
		
		usuarios.add(new UsuarioLista("Higor"));
		usuarios.add(new UsuarioLista("Samara"));
		usuarios.add(new UsuarioLista("Eloisa"));
		
		boolean resultado = usuarios.contains(new UsuarioLista("Samara"));
		System.out.println(resultado);
		
	}

}
