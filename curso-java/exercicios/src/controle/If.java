package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = scanner.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Legal! Você foi aprovado.");
		}
		else if (media <= 7.0 && media >= 5) {
			System.out.println("Você ficou de recuperação. Terá mais uma chance, não desperdice!");
		}
		else {
			System.out.println("Infelizmente você foi reprovado.");
		}
		
		
		scanner.close();
		
		System.out.println("\n\nEncerrando!!!");
	}
	
}
