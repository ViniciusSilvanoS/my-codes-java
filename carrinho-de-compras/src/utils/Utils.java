package utils;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Utils {

	static String padrao1 = "R$ ###,##0.00";
	static DecimalFormat df = new DecimalFormat(padrao1);
	
	public static String doubleToString(double valor) {
		return df.format(valor);
	}
	
	public static void escreve(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static int insereNum(String message) {
		
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}
	
	public static void out(String message) {
		System.out.println("MESSAGE: " + message);
	}
	
}
