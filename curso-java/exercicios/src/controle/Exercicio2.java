package controle;

import java.util.Scanner;

public class Exercicio2 {
	
	// Calcular ano bissexto
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o ano desejado: ");
		int ano = scanner.nextInt();
		
		// Calculando ano bissexto
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 100 == 0 & ano % 400 == 0) {
			System.out.println("É bissexto");
		}else {
			System.out.println("Não é bissexto");
		}
		
		System.out.println("\n\nFinalizando!!!");
		scanner.close();
	}
	
}
