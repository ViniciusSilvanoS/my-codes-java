package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Professor colocou na aula com o nome ( Fornecedor )
public class P7Supplier {

	public static void main(String[] args) {
		
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umLista.get());
		
	}

}
