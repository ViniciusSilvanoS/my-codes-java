package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio6 {
	
	//Equação do 2º grau (Bhaskara)
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o valor de c: ");
		int c = scanner.nextInt();
		
		double delta = (b * b) -4 *(a*c);
		System.out.println("O valor do delta é: " + delta);
		
		delta = Math.sqrt(delta);
		double x1 = ((b*-1) + delta) / (2 * a);
		double x2 = ((b*-1) + (delta * -1)) / (2 * a);
		
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
		
		
		scanner.close();
		
	}
	
}
