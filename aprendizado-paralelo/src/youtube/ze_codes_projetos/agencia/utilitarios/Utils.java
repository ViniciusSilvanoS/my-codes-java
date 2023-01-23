package youtube.ze_codes_projetos.agencia.utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Utils {

	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
	
	public static String doubleToString(Double valor) {
		return formatandoValores.format(valor);
	}
	
	public static void paneEscrever(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static String paneInserir(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
}
