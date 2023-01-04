package controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int num = 0;
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);

		
		while(num >= 0) {
			System.out.println("Digite: ");
			num = scanner.nextInt();
			if(num >=0) {
				soma += num;
				System.out.println("Soma atual: " + soma);
			}
		}
		System.out.println("\n\nEncerrando!");
		
		
		scanner.close();
		
	}
	
}
