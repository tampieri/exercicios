package fundamentos;

import java.util.Scanner;

public class ExemploCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o operador: ");
		String operador = entrada.next();
		
		System.out.print("Informe o numero: ");
		double num2 = entrada.nextDouble();
		
		//Logica da operação
		double result = "+".equals(operador) ? num1 + num2 : 0;
		result = "-".equals(operador) ? num1 - num2 : result;
		result = "*".equals(operador) ? num1 * num2 : result;
		result = "/".equals(operador) ? num1 / num2 : result;
		result = "%".equals(operador) ? num1 % num2 : result;;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
		
		entrada.close();
	}
}
