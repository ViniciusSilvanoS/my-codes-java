package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio5 {
	
	//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Para calcular a área do triângulo, digite a base e a altura: ");
		System.out.println("Base: ");
		double base = scanner.nextDouble();
		
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
		
		double resultado = (base * altura)/2;
		System.out.println("A área do triângulo é de " + resultado +" m²");
		
		scanner.close();
		System.out.println("\n\nEncerrando!");
		
	}
	
	
	
	
}
