package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double notavalida = 0;
		double soma = 0;
		int cont = 0;
		
		// Captando as notas válidas
		while(notavalida != -1){
			
			System.out.print("Digite a nota de 0 a 10 (ou -1 para sair): ");
			notavalida = scanner.nextDouble();
			if (notavalida >= 0 && notavalida <=10) {
				soma += notavalida;
				cont++;
			}else if (notavalida != -1){
				System.out.println("\nNota invalida, digite novamente.\n");
			}
			
			if (notavalida == -1) {
				System.out.println("\n\nSaindo!\n");
			}
			
		}
		
		// Calcular a média
		double resultado = soma / cont;
		System.out.println("A média da turma é de " + resultado + " referente aos " + cont + " alunos que fizeram o teste.");
		
		
		scanner.close();
		
		
	}
	
}
