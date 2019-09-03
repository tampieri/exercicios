package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Higor");
		usuarios.put(2, "Samara");
		usuarios.put(3, "Eloisa");
		usuarios.put(4, "Nina");
		usuarios.put(5, "Maia");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Maia"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "Higor"));
		
		for (int key : usuarios.keySet()) {
			System.out.println(key);
		}
		
		for (String usu : usuarios.values()) {
			System.out.println(usu);
		}
		
		for(Entry<Integer, String> reg : usuarios.entrySet()) {
			System.out.print(reg.getKey() + " -- " );
			System.out.println(reg.getValue());
		}
	}
}
