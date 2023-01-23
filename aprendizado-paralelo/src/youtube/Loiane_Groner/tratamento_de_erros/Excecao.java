package youtube.Loiane_Groner.tratamento_de_erros;

import java.rmi.NotBoundException;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception");
			vetor[4] = 1;
			System.out.println("Este texto não será impresso");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Está acessando um índice que não existe");
		}
		
		System.out.println("Este texto será impresso após a exceção");
		
	}
	
}
