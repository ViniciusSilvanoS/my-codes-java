package arrays2;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite quantos alunos tem: ");
		int qtdAlunos = scanner.nextInt();
		
		System.out.println("Quantas notas terá cada aluno: ");
		int qtdNotas = scanner.nextInt();
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int i = 0; i < notasTurma.length; i++) {
			System.out.println((i+1) + "º aluno.");
			for(int j = 0; j < notasTurma[i].length; j++) {
				System.out.println("Digite a " + (j+1) + "ª nota: ");
				notasTurma[i][j] = scanner.nextDouble();
				total += notasTurma[i][j];
			}
			System.out.print("\n");
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turma: " + media);
		
		scanner.close();
		
	}
	
}
