package youtube.gustavo_guanabara.poo06Encapsulamento;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num3;
		
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3: "));
		JOptionPane.showMessageDialog(null, "Olá" + num1 + " e Olá " + num2 + " e OBA " + num3);
		
	}
	
}
