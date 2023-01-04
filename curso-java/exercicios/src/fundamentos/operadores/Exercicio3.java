package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio3 {

	//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		double alturaquadrado = Math.pow(altura, 2);
		double resultado = peso / alturaquadrado;
		
		System.out.println("Seu IMC é de " + resultado);
		
		
		
		
		scanner.close();
		System.out.println("\n\nEncerrando!");
	}
	
}
