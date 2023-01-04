package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			
			System.out.println("Digite qualquer coisa para continuar ou SAIR para sair: ");
			palavra = scanner.next();
			System.out.println("Você digitou ( " + palavra + " )");
			
		}
		
		System.out.println("\n\nVocê saiu, parabéns!!!");
		
		
		
		scanner.close();
		
		
	}
	
}
