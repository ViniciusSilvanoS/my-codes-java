package classe.DesafioJantar;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
//		Pessoa p1 = new Pessoa();
//		System.out.print("Digite o nome da pessoa: ");
//		p1.nome = scanner.next();
//		System.out.print("Digite o peso: ");
//		p1.peso = Double.parseDouble(scanner.next());
//		
//		Comida c1 = new Comida();
//		System.out.print("Digite o nome da comida: ");
//		c1.nome = scanner.next();
//		System.out.print("Digite o peso: ");
//		c1.peso = Double.parseDouble(scanner.next());
//		
//		System.out.printf("Antes de comer %s pesava %.2f killos\n", p1.nome, p1.peso);
//		
//		
//		System.out.printf("Depois de comer %s pesa killos", p1.comer());

		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 99.8);
		
		System.out.println("Olá ei sou " + p.nome + " tenho " + p.peso + " killos.");
		
		p.comer(c1);
		System.out.println("Olá ei sou " + p.nome + " tenho " + p.peso + " killos.");
		
		p.comer(c2);
		System.out.println("Olá ei sou " + p.nome + " tenho " + p.peso + " killos.");

		scanner.close();
		
	}
	
}
