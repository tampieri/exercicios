package fundamentos;

public class ConversaoTiposNumericos {

	public static void main(String[] args) {
		
		//Convers�o implicita
		double a = 1;
		System.out.println(a);
		
		//Convers�o explicita (Cast)
		float b = (float) 1.123121231;
		System.out.println(b);
		
		//Convers�o explicita (Cast)
		int c = 127;
		byte d = (byte) c;
		System.out.println(d);
		
		//Convers�o explicita (Cast)
		double e = 1.888888;
		int f = (int) e;
		System.out.println(f);
	}

}
