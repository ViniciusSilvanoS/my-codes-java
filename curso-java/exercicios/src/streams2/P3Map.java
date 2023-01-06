package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class P3Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);;
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> Character.toString(n.charAt(0));
//		UnaryOperator<String> grito = n -> n + "!!! ";
		
//		System.out.println();
//		System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
		
		System.out.println("\n\nUsando Composição...");
		marcas.stream()
		.map(P3Utils.maiuscula)
		.map(primeiraLetra)
		.map(P3Utils::grito)
		.forEach(print);
	}
	
}
