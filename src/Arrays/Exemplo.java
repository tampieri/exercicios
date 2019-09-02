package Arrays;

import java.util.Arrays;

public class Exemplo {

	public static void main(String[] args) {
		
		double[] valoresA = new double[3];
		
		valoresA[0] = 7.9;
		valoresA[1] = 8;
		valoresA[2] = 6.7;
		
		System.out.println(Arrays.toString(valoresA));
		System.out.println(valoresA[0]);
		System.out.println(valoresA[valoresA.length - 1]);
		
		double total = 0;
		
		for (int i = 0; i < valoresA.length; i++) {
			total += valoresA[i];
		}
		
		System.out.println(total / valoresA.length);
		
		double valorArmazenado = 5.9;
		double[] valoresB = {6.9, 8.0, valorArmazenado, 10};
		
		double totalB = 0;
		for (int i = 0; i < valoresB.length; i++) {
			totalB += valoresB[i];
		}
		
		System.out.println(totalB / valoresB.length);
		
	}
}
