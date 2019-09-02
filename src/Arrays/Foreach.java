package Arrays;

public class Foreach {

	public static void main(String[] args) {

		double[] valores = {9.9, 7.8, 4.5, 3.5};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		System.out.println();
		
		for (double d : valores) {
			System.out.println(d);
		}

	}

}
