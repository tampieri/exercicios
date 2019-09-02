package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<UsuarioLista> lista = new ArrayList<>();
		
		UsuarioLista u1 = new UsuarioLista("Higor");
		lista.add(u1);
		
		lista.add(new UsuarioLista("Samara"));
		lista.add(new UsuarioLista("Eloisa"));
		lista.add(new UsuarioLista("Maia"));
		lista.add(new UsuarioLista("Nina"));
		
		System.out.println(lista.get(2));
		
		System.out.println("removido " + lista.remove(2).nome);
		System.out.println(lista.remove(new UsuarioLista("Nina")));
		
		System.out.println("Esta na lista? " + lista.contains(new UsuarioLista("belinha")));
		System.out.println("Esta na lista? " + lista.contains(u1));
		
		for (UsuarioLista usuario : lista) {
			System.out.println(usuario.nome);
		}
	}

}
