package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	//uma interface funcional so pode ter um metodo
	//double teste(int a);
	
	//pode existir outros metodos mas somente um abstrato
	default String MetodoNaoAbstrato1() {
		return "Texto qualquer";
	}
	
	static String MetodoNaoAbstrato2() {
		return "Outro texto qualquer";
	}
}
