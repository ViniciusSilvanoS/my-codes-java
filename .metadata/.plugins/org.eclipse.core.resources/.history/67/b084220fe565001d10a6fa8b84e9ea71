package lambdas;

import java.util.function.Predicate;

public class P3Predicado {

	public static void main(String[] args) {
		
		Predicate<P3Produto>  isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		P3Produto produto = new P3Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
		
	}
	
}
