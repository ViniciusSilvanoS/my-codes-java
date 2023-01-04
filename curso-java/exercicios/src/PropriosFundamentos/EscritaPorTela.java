package PropriosFundamentos;

import javax.swing.JOptionPane;

public class EscritaPorTela {

	public static void main(String[] args) {
		int idade;
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		JOptionPane.showMessageDialog(null, "Sua idade é de " + idade + " anos");
		
	}
	
}
