package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		//double media = 5.6;
		//double media = 4.6;
		
		String resultadoPacial = media >= 5.0 ? "em recupera��o" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoPacial;
		
		System.out.println("Aluno est�: " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o";
 		
		System.out.println("Tem desconto:" + resultado);
	}
}
