package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de Alunos? ");
		int qteAlunos = entrada.nextInt();
		
		System.out.print("Quantidade de notas por aluno? ");
		int qteNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qteAlunos][qteNotas];
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		double media = total / (qteAlunos * qteNotas);
		System.out.println("Media da turma é " + media);
		
		for (double[] ds : notasDaTurma) {
			System.out.println(Arrays.toString(ds));
		}
		entrada.close();
	}
}
