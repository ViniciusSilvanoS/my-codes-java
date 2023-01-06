package streams2.desafio_map;

import java.util.function.BinaryOperator;

public class Teste {

	public static void main(String[] args) {
		
		int v = 6;
		String str = Integer.toBinaryString(v);
		
		System.out.println("Conversão para binário: " + str);

		
		String nstr = new StringBuffer(str).reverse().toString();
		System.out.println("Invertido: " + nstr);
		
		v = Integer.parseInt(nstr, 2);
		System.out.println("Conversão para número: " + v);
	}
	

	
}
