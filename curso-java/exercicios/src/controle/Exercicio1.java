package controle;

import java.util.Scanner;

public class Exercicio1 {

	// Validar numero e ver se é par
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Digite um número de 0 a 10: ");
		do{
			num = scanner.nextInt();
			if(num < 0 || num > 10) {
				System.out.println("Número inválido, digite novamente: ");
			}
		}while(num < 0 || num > 10);
		
		if(num % 2 == 0) {
			System.out.println("O número digitado é par!");
		}
		
		System.out.println("\n\nFinalizando!");
		scanner.close();
	}
	
}
