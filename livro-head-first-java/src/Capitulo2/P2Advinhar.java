package Capitulo2;

import java.util.Random;
import java.util.Scanner;

public class P2Advinhar {
	Random aleatorio = new Random();
	// Instancia variáveis no tipo objeto P2Jogador
	P2Jogador p1;
	P2Jogador p2;
	P2Jogador p3;

	int num;

	public void startGame() {
		System.out.println("Digite a dificuldade do jogo. ");
		System.out.println("Considerando que o jogo comece com 0, quantos números serão sorteados?  ");
		Scanner scanner = new Scanner(System.in);
		int qtdChutes = scanner.nextInt();
		scanner.close();

		num = aleatorio.nextInt(qtdChutes);

		// Declarando o nome de cada jogador
		p1 = new P2Jogador("Bianca");
		p2 = new P2Jogador("Eliezer");
		p3 = new P2Jogador("Junior");

		System.out.println("O número a ser encontrado é: " + num + "\n");

		// Teste para ver quantos e quais jogadores ganharam
		while (true) {

			p1.pegaChute(qtdChutes);
			p2.pegaChute(qtdChutes);
			p3.pegaChute(qtdChutes);

			System.out.println(p1.nome + " chutou o número " + p1.numero);
			System.out.println(p2.nome + " chutou o número " + p2.numero);
			System.out.println(p3.nome + " chutou o número " + p3.numero);

			int cont = 0;

			if (num == p1.numero) {
				cont++;
			}
			if (num == p2.numero) {
				cont++;
			}
			if (num == p3.numero) {
				cont++;
			}

			// Separa cada tipo de resultado, definindo como será exibido
			if (cont > 0) {
				if (cont == 1) {
					System.out.println("\nTemos " + cont + " vencedor!!!");
					if (num == p1.numero) {
						System.out.println("Parabéns " + p1.nome);
					}
					if (num == p2.numero) {
						System.out.println("Parabéns " + p2.nome);
					}
					if (num == p3.numero) {
						System.out.println("Parabéns " + p3.nome);
					}
				} else {
					System.out.println("\nTemos " + cont + " vencedores!!!");
					System.out.print("Parabéns ");
					if (num == p1.numero) {
						System.out.print(p1.nome);
						if (num == p3.numero && num == p2.numero) {
							System.out.print(", ");
						} else {
							System.out.print(" e ");
						}
					}
					if (num == p2.numero) {
						System.out.print(p2.nome);
						if (num == p3.numero) {
							System.out.print(" e ");
						} else {
							System.out.print(".");
						}
					}
					if (num == p3.numero) {
						System.out.print(p3.nome + ".");
					}
				}
				break;
			}else {
				System.out.println();
			}

		}

	}

}
