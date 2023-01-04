package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite o sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("\nSeu nome completo é %s %s e você tem %d anos", nome, sobrenome, idade);

		
		entrada.close();
		
		

	}

}
