package controle;

public class DoWhile {

	public static void main(String[] args) {
		
		String palavra = "";
		
		 do{
			
			System.out.println("Digite qualquer coisa para continuar ou SAIR para sair: ");
			System.out.println("Você digitou ( " + palavra + " )");
			
		}while(!palavra.equalsIgnoreCase("sair"));
		
		System.out.println("\n\nVocê saiu, parabéns!!!");
		
		
	}
	
	
}
