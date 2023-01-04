package controle;

import java.util.Scanner;

public class Exercicio3 {
	
	// Media da nota. Aprovado, recuperação e repovado.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("1ª NOTA: ");
		double n1 = scanner.nextDouble();
		System.out.print("2ª NOTA: ");
		double n2 = scanner.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}else if(media > 4) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}

		scanner.close();
		
	}
	
}
