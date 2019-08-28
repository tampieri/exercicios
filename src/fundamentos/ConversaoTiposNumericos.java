package fundamentos;

public class ConversaoTiposNumericos {

	public static void main(String[] args) {
		
		//Conversão implicita
		double a = 1;
		System.out.println(a);
		
		//Conversão explicita (Cast)
		float b = (float) 1.123121231;
		System.out.println(b);
		
		//Conversão explicita (Cast)
		int c = 127;
		byte d = (byte) c;
		System.out.println(d);
		
		//Conversão explicita (Cast)
		double e = 1.888888;
		int f = (int) e;
		System.out.println(f);
	}

}
