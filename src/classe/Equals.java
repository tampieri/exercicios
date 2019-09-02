package classe;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Higor Tampieri";
		u1.email = "higortampieri1@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Higor Tampieri";
		u2.email = "higortampieri1@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}

}
