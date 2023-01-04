package arrays2;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas notas você quer informar? ");
		int qtd = scanner.nextInt();
		
		double[] notasTurma = new double[qtd];
		
		for(int i = 0; i < notasTurma.length; i++) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			notasTurma[i] = scanner.nextDouble();
		}
		
		double total = 0;
		for(double nota: notasTurma) {
			total += nota;
		}
		
		System.out.println("A média da turma é: " + (total / notasTurma.length));
		
		scanner.close();
		
	}
}
