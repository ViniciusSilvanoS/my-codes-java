package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio1 {

	//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Converção de Fahrenheit para Celsius!");
		System.out.print("Digite o valor em Fahrenheit:");
		double f = scanner.nextDouble();
		double resultado = (f-32)/1.8;
		System.out.println("O resultado em Celsius é " + resultado);
		
		
		
		System.out.println("Converção de Celsius para Fahrenheit!");
		System.out.print("Digite o valor em Celsius:");
		double c = scanner.nextDouble();
		resultado = (c*1.8)+32;
		System.out.println("O resultado em Fahrenheit é " + resultado);
		
		
		
		
		scanner.close();
		System.out.println("\n\nEncerrando");
		
		
	}
	
}
