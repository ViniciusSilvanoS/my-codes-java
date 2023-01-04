package exercicioVetor;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class InserirDados {
	
	// O usuário preenche todas posições do vetor
	static int[] insereVet(int tamanho, Scanner scanner){
		int[] vet = new int[tamanho];
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite " + tamanho + " números:");
		for(int i = 0; i < vet.length; i++) {
			
			System.out.print((i + 1) + "º: ");
			vet[i] = validaNumNatural(scanner);
			
		}
		
//		scanner.close();
		return vet;
	}
	
	
	// Usado para validar se os números inseridos são naturais
	static int validaNumNatural(Scanner scanner) {
		int num;
//		Scanner teclado = new Scanner(System.in);
		while(true) {
			num = scanner.nextInt();
//			scanner.nextLine();
			if(num > 0) {
//				teclado.close();
				return num;
			}else {
				System.out.println("Digite novamente! Número inválido.");
			}
			
		}
		
	}
	
	// Retorna o vetor para exibir na tela
	static String toString(int[] vet) {
		String vetorText = "";
		int cont = 0;
		
		for(int i = 0; i < vet.length; i++) {
			cont++;
			if(i != (vet.length - 1)) {
				vetorText += cont + "º: " + vet[i] + " | ";
			}else {
				vetorText += cont + "º: " + vet[i];
			}
			
		}
		
		return vetorText;
	}
	
	// Preenche automaticamente para agilizar os testes
	static int[] encheVet(int tamanhoVet){
		int cont = 0;
		//int[] vet = {1, 2, 3, 4, 12, 13, 14, 15, 16, 17}; (Este é o padrão caso tenha tamanho 10)
		int[] vet = new int[tamanhoVet];
		
		for(int i = 0; i < tamanhoVet;i++) {
			cont++;
			
			if(cont == 5) { // Foi feita para terem duas posições com números mais distante que de outras. Assim como necessita no teste.
				cont = 12;
				vet[i] = cont;
			}else {
				vet[i] = cont;
			}
		}

		return vet;
	}
	

	
	// Testando inserção com JOptionPane
//	static int valida() {
//		int num = 0;
//		while(true) {
//			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
//			if(num > 0) {
//				return num;
//			}else {
//				System.out.println("Digite novamente! Número inválido.");
//			}
//		}
//	}
}
