package exercicios.lista1;

import java.util.Scanner;

public class E1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();
		
		System.out.println("Digite o mes: ");
		int mes = scanner.nextInt();
		
		System.out.println("Digite os dias: ");
		int dia = scanner.nextInt();
		
		scanner.close();
		
		int soma = (ano * 365) + (mes * 30) + dia;
		
		System.out.println("São " + soma + " dias de vida.");
		
		
		
	}
	
}
