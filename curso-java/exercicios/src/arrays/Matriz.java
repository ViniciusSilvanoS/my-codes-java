package arrays;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Matriz {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtdeAlunos = scanner.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = scanner.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {
			for(int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("Informa a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = scanner.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
//		System.out.println(Arrays.toString(notasDaTurma));

		for(double[] notaDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notaDoAluno));
		}
		
		scanner.close();
		
	

		
	}
	
}
