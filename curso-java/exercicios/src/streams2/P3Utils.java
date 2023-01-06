package streams2;

import java.util.function.UnaryOperator;

public class P3Utils {

	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = n -> Character.toString(n.charAt(0));
	
	public final static String grito(String n){
		return n + "!!! ";
	}
	
}
