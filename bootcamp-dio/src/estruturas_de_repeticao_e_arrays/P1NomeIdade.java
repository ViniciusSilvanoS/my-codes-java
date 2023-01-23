package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class P1NomeIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String nome;
		int idade;
		
		while(true) {
	
			System.out.println("Nome: ");
			nome = scanner.nextLine();
//			scanner.next();
			if(nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scanner.nextInt();
			scanner.nextLine();
			
		}
		
		System.out.println("Saindo...");

		
		
	}
	
}
