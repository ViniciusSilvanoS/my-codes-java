package youtube.Loiane_Groner.tratamento_de_erros;

public class ExceptionGenerica {

	public static void main(String[] args) {
		
		int[] vet = {1, 2, 3};
		
		try {
			for(int i = 0; i <= vet.length; i++) {
				System.out.println(vet[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
