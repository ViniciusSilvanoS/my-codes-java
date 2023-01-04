package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	// Tentar acertar o numero aleatorio
	public static void main(String[] args) {
		int tentativa;
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int aleatorio = random.nextInt(100);
		System.out.println("Digite o número: ");
		
		for (int i = 9; i >= 0; i--) {
			tentativa = scanner.nextInt();
			if(tentativa < 0 || tentativa > 100) {
				while(tentativa < 0 || tentativa > 100) {
					System.out.println("Valor inválido.");
					System.out.println("Digite novamente: ");
					tentativa = scanner.nextInt();
				}
			}else if(tentativa == aleatorio) {
				System.out.println("Você acertou, parabéns!");
				break;
			}else if(tentativa > aleatorio) {
				System.out.println("Abaixo");
			}else if(tentativa < aleatorio) {
				System.out.println("Acima");
			}
			System.out.println("Restam " + i + " tentativas");
		}
		
		
		
		System.out.println("\n\nFinalizando!!!");
		scanner.close();
		
	}
	
}
