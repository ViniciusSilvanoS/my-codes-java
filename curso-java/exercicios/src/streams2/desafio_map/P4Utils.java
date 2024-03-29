package streams2.desafio_map;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P4Utils {

	public final static Function<Integer, String> integerToBinary = num -> Integer.toBinaryString(num);
	
	public final static Function<String, Integer> binaryToInteger = bin -> Integer.parseInt(bin, 2);
	
	public final static UnaryOperator<String> inverterBinary = v -> {
		
		String invert = new StringBuffer(v).reverse().toString();
		return invert;
		
	};
	
	public final static Function<Integer, String> integerToString = v -> Integer.toString(v);
	
}
