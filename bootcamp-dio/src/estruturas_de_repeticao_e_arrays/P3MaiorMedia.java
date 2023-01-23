package estruturas_de_repeticao_e_arrays;

import java.util.Scanner;

public class P3MaiorMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma += numero;
			if(numero > maior) maior = numero;
			
			count++;
		}while(count < 5);
		
		System.out.println("Maior número: " + maior + "\nSoma: " + soma + "\nMedia: " + (soma / 5));
	}
	
}
