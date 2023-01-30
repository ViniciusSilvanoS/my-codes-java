package agencia.utilities;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

import agencia.programa.Validar;

public class Utils {

	static NumberFormat formataMoeda = new DecimalFormat("R$ #,##0.00");
	
	
	public static String doubleToStringMoeda (double valor) {
		return formataMoeda.format(valor);
	}
	
	
	public static void paneEscrever (String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	
	public static String paneInserirString (String mensagem) {
		
		String valor = JOptionPane.showInputDialog(mensagem);
		Validar.stringVazio(valor, "SEM REFERENCIA");
		
		return valor;
		
	}
	
	
	public static int paneInserirInt (String mensagem) {
		
		String valor = JOptionPane.showInputDialog(mensagem);
		Validar.stringVazio(valor, "SEM REFERENCIA");
		
		
		return Integer.parseInt(valor);
		
	}
	
	
	public static double paneInserirDouble (String mensagem) {
		
		String valor = JOptionPane.showInputDialog(mensagem);
		Validar.stringVazio(valor, "SEM REFERENCIA");
		
		
		return Double.parseDouble(valor);
		
	}
	

	
}
