package oo.composicao_teste2.meu.desafio;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ClienteTeste {

	public static void main(String[] args) {
		
//		String padrao1 = "###,###.##";
//		DecimalFormat df = new DecimalFormat(padrao1);
//		
//		System.out.println(df.format(1234567890.123));
//		
//		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String padrao2 = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(1234567890.123));
//		
//		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
//		dfs.setGroupingSeparator('.');
//		dfs.setDecimalSeparator(',');
//		String padrao3 = "###,###.##";
//		DecimalFormat df = new DecimalFormat(padrao3, dfs);
//		df.setGroupingSize(4);
//		System.out.println(df.format(1234567890.123));
//		
//		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
//		dfs.setGroupingSeparator('.');
//		dfs.setDecimalSeparator(',');
//		
//		String padrao4 = "###,##0.00";
//		DecimalFormat df = new DecimalFormat(padrao4, dfs);
//		System.out.println(df.format(0.1));
//		
		
		
		Compra compra1 = new Compra();
		compra1.addItem("Shampoo", 18.90, 3);
		compra1.addItem("Arroz", 5.50, 5);
		compra1.addItem("Feijão", 8.90, 1);
		
		Compra compra2 = new Compra();
		compra2.addItem("Bombom", 3.50, 10);
		compra2.addItem("Creme de leite", 5.50, 3);
		compra2.addItem("Leite condensado", 9.90, 2);
		
		Cliente cliente1 = new Cliente("Roberto");
		cliente1.addCompra(compra1);
		cliente1.addCompra(compra2);
	
		
		System.out.println("R$ " + df.format(cliente1.totalCliente()));

	}
	
}
