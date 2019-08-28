package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhor");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Higor".toUpperCase());
		
		String x = "Higor".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Higor");
		System.out.println(y);
		
		String z = "Bom dia X"
				.replace("X", "Higor")
				.toUpperCase()
				.concat("!!!");
		System.out.println(z);
		
		//tipos primitivos não tem anotação "."
		int i = 3;
		System.out.println(i);

	}

}
