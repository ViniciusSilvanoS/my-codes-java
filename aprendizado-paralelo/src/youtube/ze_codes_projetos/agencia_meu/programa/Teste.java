package youtube.ze_codes_projetos.agencia_meu.programa;

import javax.swing.JOptionPane;

import youtube.ze_codes_projetos.agencia_meu.utilities.Utils;

public class Teste {

	public static void main(String[] args) {
		
//		int valor = JOptionPane.showConfirmDialog(null, "Você tem certeza? ", "Atanção", JOptionPane.YES_OPTION);
		
//		String [] regra = {"Editar", "Exlcuir", "Cancelar"};
//		int valor2 = JOptionPane.showOptionDialog(null, "Deseja excluir ou editar?", "Opções", 0, JOptionPane.QUESTION_MESSAGE, null, regra, "Cancelar");
//		System.out.println("Valor2: " + valor2);
		
//		int value = JOptionPane.showOptionDialog(null, "O que deseja fazer? ", null, 0, 0, null, "Teste 2", "Teste 3");
		
//		int value = JOptionPane.showConfirmDialog(null, "CONFIRMAR EXCLUSÃO?\nTotal: " +
//				Utils.doubleToStringMoeda(12345.05), "Aviso!", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
//		
//		System.out.println(value);
		
		int valor = JOptionPane.showConfirmDialog(null, "CONFIRMAR EXCLUSÃO?", "Aviso!", JOptionPane.WARNING_MESSAGE,
				JOptionPane.YES_NO_OPTION);
		
		System.out.println(valor);
		
	}
	
}
