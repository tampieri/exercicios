package classe;

public class AreaCirculoTeste {

	public static void main(String[] args) {
		
		//AreaCirculo.pi = 3.1415;

		AreaCirculo a1 = new AreaCirculo(10.0);
		//a1.pi = 10;
		System.out.println(a1.area());
		System.out.println(a1.PI);
		
		System.out.println(AreaCirculo.area(20.0));
		System.out.println(Math.PI);

	}

}
