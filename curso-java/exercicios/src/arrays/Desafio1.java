package arrays;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite quantas notas você deseja inserir: ");
		int quantidade = scanner.nextInt();
		
		double[] notaTurmaA = new double[quantidade];
		for(int i = 0; i < notaTurmaA.length; i++) {
			System.out.print("Didite a " + (i + 1) + "ª nota: ");
			notaTurmaA[i] = scanner.nextDouble();
		}
		
		double soma = 0;
		for(double nota : notaTurmaA) {
			soma += nota;
		}
		
		System.out.println("A média da turma é de " + soma / notaTurmaA.length);

		scanner.close();
		
	}
	
}
