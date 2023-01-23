package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class P2Nota {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int nota;
		
		System.out.println("Nota: ");
		nota = scanner.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Digite novamente: ");
			nota = scanner.nextInt();
		}
		
		System.out.println("Saindo...");

		
	}
	
}
