package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 4));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 4));
		
		System.out.println(calculo.MetodoNaoAbstrato1());
		System.out.println(Calculo.MetodoNaoAbstrato2());
	}
}
