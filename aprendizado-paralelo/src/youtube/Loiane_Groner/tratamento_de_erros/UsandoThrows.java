package youtube.Loiane_Groner.tratamento_de_erros;

import java.util.Scanner;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Escreva um número decimal: ");
		try {
			double num = lerNumero();
			System.out.println("Você digitou: " + num);
		} catch (Exception e) {
			/* Melhor forma de informar uma exceção. 
			 * Mostrando uma mensagem coerente pro usuário. 
			 * Colocar um erro facil de identificar pro desenvolvedor e 
			 * colocar o printStackTrace() para saber o erro específico */ 
			
//			JOptionPane.showMessageDialog(null, "Valor digitado inválido!"); comentei somente para não poluir em teste
			
			System.out.println("ERRO: Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double lerNumero() throws Exception {
		
		Scanner scanner = new Scanner(System.in);

		double num = scanner.nextDouble();

		return num;
		
	}
	
}
