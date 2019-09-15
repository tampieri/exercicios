package streams;

import java.util.function.UnaryOperator;

public interface UnaryUtils {
	
	public static UnaryOperator<String> maiuscula =
		n -> n.toUpperCase();
	
	public static UnaryOperator<String> primeiraLetra =
		n -> n.charAt(0) + "";
	
	public static String grito(String n) {
		return n + "!!! ";
	}
}
