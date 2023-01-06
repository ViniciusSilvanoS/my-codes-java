package streams2.desafio_map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * 1. Número para string binária... 6 => "110"
 * 2. Inverter a string... "110" => "011"
 * 3. Converter de volta para inteiro => "011" => 3
 * */

public class P4DesafioMap {

	public static void main(String[] args) {
		
//		Consumer<String> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Executando: ");
		nums.stream()
			.map(P4Utils.integerToBinary)
			.map(P4Utils.inverterBinary)
			.map(P4Utils.binaryToInteger)
			.map(P4Utils.integerToString)
			.forEach(System.out::print);

		
	}
	
}
