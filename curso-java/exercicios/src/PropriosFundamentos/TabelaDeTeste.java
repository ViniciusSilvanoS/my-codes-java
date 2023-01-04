package PropriosFundamentos;

import java.util.Random;

public class TabelaDeTeste {

	public static void main(String[] args) {

		// Números aleatórios
		System.out.println("|Números aleatórios|");
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		System.out.println(aleatorio);

		
		// Número elevado a outro (Ex. Área do circulo)
		System.out.println("\n|Número elevado a outro (Ex. Área do circulo)|");
		double raioDoCirculo = 5;
		final double PI = 3.14;
		double areaDoCirculo;
		areaDoCirculo = Math.pow(raioDoCirculo, 2);
		System.out.println("Número ao quadrado: " + areaDoCirculo);
		areaDoCirculo = Math.pow(raioDoCirculo, 2) * PI;
		System.out.println("Área do circulo: " + areaDoCirculo);

		
		// Nome simplificado somente com o primeiro nome e o ultimo sobrenome
		System.out.println("\n|Nome simplificado somente com o primeiro nome e o ultimo sobrenome|");
		String nome1 = "Vinicius Silvano da Silva";
		String nomeSimplificado;
		int vazio1, vazio2;

		vazio1 = nome1.indexOf(" ");
		System.out.println("Primeiro nome: " + nome1.substring(0, vazio1));

		vazio2 = nome1.lastIndexOf(" ") + 1;
		System.out.println("Último nome: " + nome1.substring(vazio2));

		nomeSimplificado = nome1.substring(0, vazio1) + " " + nome1.substring(vazio2);
		System.out.println("Nome simplificado: " + nomeSimplificado);

	}

}
