package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio4 {
	
	//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor desejado para elevar ao quadrado e ao cubo: ");
		double valor = scanner.nextDouble();
		double resultado = Math.pow(valor, 2);
		System.out.printf("O número digitado elevado ao quadrado é %.0f", resultado);

		resultado = Math.pow(valor, 3);
		System.out.printf("\nO número digitado elevado ao cubo é %.0f", resultado);
		
		
		scanner.close();
		System.out.println("\n\nEncerrando!");
	}
	
}
