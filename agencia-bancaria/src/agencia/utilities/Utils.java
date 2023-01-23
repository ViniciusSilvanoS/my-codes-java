package agencia.utilities;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Utils {

	static NumberFormat formataMoeda = new DecimalFormat("R$ #,##0.00");
	
	public static String doubleToStringMoeda (double valor) {
		return formataMoeda.format(valor);
	}
	
	public static void paneEscrever (String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static String paneInserirString (String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
	public static int paneInserirInt (String mensagem) {
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	}
	
	public static double paneInserirDouble (String mensagem) {
		return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
	}
	
}
