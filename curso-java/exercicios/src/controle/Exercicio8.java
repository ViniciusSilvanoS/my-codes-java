package controle;

import java.util.Scanner;

public class Exercicio8 {

	// Escrever letra por letra da palavra
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a palavra: ");
		String palavra = scanner.next();
//		int tamanho = palavra.length();
		
//		System.out.println(tamanho);
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		scanner.close();
		
	}
	
}
