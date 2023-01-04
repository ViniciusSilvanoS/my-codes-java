package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		/*
		 * v e v = televisao de 50 + sorvete
		 * v e f = tv 32 + sorvete
		 * f e f = nada
		 */
		
		Scanner entrada = new Scanner(System.in);
		               
		System.out.print("O primeiro trabalho foi bem sucedido? ");
		boolean t1 = Boolean.parseBoolean(entrada.nextLine());
		
		System.out.print("O segundo trabalho foi bem sucedido? ");
		boolean t2 = Boolean.parseBoolean(entrada.nextLine());
		
		boolean tv50 = t1 && t2;
		boolean tv30 = t1 ^ t2;
		boolean sorvete = t1 || t2;
		
		System.out.printf("\nComrou a TV de 50? %b", tv50);
		System.out.printf("\nComrou a TV de 30? %b", tv30);
		System.out.printf("\nComeram sorvete? %b", sorvete);
		
		
		entrada.close();
		
	}
	
}
