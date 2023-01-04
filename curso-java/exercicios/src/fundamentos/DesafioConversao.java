package fundamentos;

import java.util.Scanner;
//import java.text.DecimalFormat;
//import java.text.NumberFormat;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o 1º salário: ");
		String a = teclado.nextLine().replace(",", ".");
		
		System.out.print("Digite o 2º salário: ");
		String b = teclado.nextLine().replace(",", ".");
		
		System.out.print("Digite o 3º salário: ");
		String c = teclado.nextLine().replace(",", ".");
		
		
		
		double s1 = Double.parseDouble(a); //aceita somente valores com ponto
		double s2 = Double.parseDouble(b);
		double s3 = Double.parseDouble(c);
	
		double media = (s1 + s2 + s3)/3;
		System.out.printf("A sua média salárial é: %.2f", media);
		
		
		
		
		System.out.println("\n\n\nFINAL!");
		teclado.close();
	}
	
}
