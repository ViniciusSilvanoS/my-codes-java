package youtube.Loiane_Groner.tratamento_de_erros;

public class Excecao2 {

	public static void main(String[] args) {
		
		try {
			int[] vet = {1, 2, 3, 4};
			
			System.out.println("Antes da exception");

			for(int i = 0;i <= 4; i++) {
				System.out.print(vet[i] + " ");
			}
			
			System.out.println("Esse texto não foi impresso!");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção ao acessar um índice inexistente do vetor!");
		}
		
		System.out.println("Após da exception");
		
	}
	
}
