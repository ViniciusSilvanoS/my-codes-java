package arrays2;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
			System.out.println((i+1) + "º aluno, nota: " + notasAlunoA[i]);
		}
		
		System.out.println("Valor total de notas é: " + total);
		System.out.printf("A média de notas é: %.2f", (total / notasAlunoA.length));
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		System.out.println("\n");
		for(int i = 0; i < notasAlunoB.length; i++) {
			System.out.println((i+1) + "º aluno, nota: " + notasAlunoB[i]);
		}
		
 	}
	
}
