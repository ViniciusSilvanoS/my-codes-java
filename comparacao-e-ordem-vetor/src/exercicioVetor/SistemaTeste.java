package exercicioVetor;

import java.util.Scanner;

public class SistemaTeste {

	public static void main(String[] args) {
		
		final int sizeVet = 10;
		int[] vet = new int[sizeVet];
		
		// Escolhe forma de inserção dos dados
		int escolhaPreencheVet;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Digite 1 ou 2 -> 1: Preenchimento manual. | 2: Preenchimento automatico para teste.\n");
			
			escolhaPreencheVet = scanner.nextInt();
			
			if(escolhaPreencheVet == 1) {
				vet = InserirDados.insereVet(vet.length, scanner);
				break;
			}else if(escolhaPreencheVet == 2) {
				vet = InserirDados.encheVet(vet.length);
				break;
			}else {
				System.out.println("Opção inválida, digite novamente!");
			}
		}
		
		// Escreve vetor
		System.out.println(InserirDados.toString(vet));
		
		// Insere X a ser comparado
		System.out.println("Digite o número X que fará comparações: ");
		int x = InserirDados.validaNumNatural(scanner);
		scanner.close();
		
		// Procura posições com a maior distância de valores
		int posicao = TrabalhoDeDados.diferencaEntreDados(vet);
		System.out.println("Os valores mais distanstes consecutivos estão nas posições " + posicao + " e " + (posicao + 1));
		
		// Escreve a ordem do vetor
		int ordem = TrabalhoDeDados.ordem(vet);
		switch(ordem){
			case 1:
				System.out.println("O vetor possui ordem crescente.");
				break;
			case -1:
				System.out.println("O vetor possui ordem decrescente.");
				break;
			case 0:
				System.out.println("O vetor está sem ordem!");
				break;
		}
		
		// Procura quantidade de números abaixo, igual ou acima do X digitado
		System.out.println("Comparando os valores do vetor com o X (" + x + ") digitado, temos:");
		int[] compara = TrabalhoDeDados.comparacao(x, vet); /*(vetor posição 1 é o centro) 
		compara[0] valores abaixo | compara[1] valores iguais | compara[2] valores maiores*/
		if(compara[0] == 1) {
			System.out.println(compara[0] + " número abaixo de X");
		}else {
			System.out.println(compara[0] + " números abaixo de X");
		}
		if(compara[1] == 1) {
			System.out.println(compara[1] + " número igual a X");
		}else {
			System.out.println(compara[1] + " números igual a X");
		}
		if(compara[2] == 1) {
			System.out.println(compara[2] + " número acima de X");
		}else {
			System.out.println(compara[2] + " números acima de X");
		}
		
	}
	
}

/*
 Considere um vetor de 10 números inteiros positivos maiores que zero e um único número X inteiro,
também positivo e maior que zero. Faça um programa para:
(a) ler pelo teclado o vetor;
(b) ler pelo teclado o número X;
(c) encontrar e imprimir o par de posições consecutivas cujas componentes possuem a maior
distância entre elas;
(d) verificar se o vetor está em ordem crescente, decrescente ou não ordenado;
(e) dizer quantos números no vetor são maiores que X, menores que X e iguais a X.
 */