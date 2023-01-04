package Testes;

import java.util.Scanner;

public class Testando {
	
	static int validaNumNatural() {
		int num;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			num = scanner.nextInt();
			scanner.nextLine();
			if(num > 0) {
				scanner.close();
				return num;
			}else {
				System.out.println("Digite novamente! Número inválido.");
			}
			
		}
	}
	

	
}
