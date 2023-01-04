package controle;

import java.util.Scanner;

public class Exercicio4 {

	// Numero primo
	public static void main(String[] args) {
	int cont = 0;
		
	Scanner scanner = new Scanner(System.in);

	System.out.print("Digite o número: ");
	int num = scanner.nextInt();
	
	for(int i = 1; i <= num; i++) {
		if(num % i == 0) {
			cont++;
		}
	}
	if(cont >= 1 && cont <= 2) {
		System.out.println("Primo");
	}else {
		System.out.println("Não primo");
	}
	
	
	System.out.println("\n\nFinalizando!");
	scanner.close();	
		
	}
	
	
}
