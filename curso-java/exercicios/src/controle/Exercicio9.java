package controle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		long valor;
		long maior = -999999999;
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Digite 10 valores: ");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "º: ");
			valor = scanner.nextLong();
			if(valor > maior) {
				maior = valor;
			}
		}
		System.out.println("O maior número digitado foi: " + maior);
		
		
		scanner.close();
		
	}
	
}
