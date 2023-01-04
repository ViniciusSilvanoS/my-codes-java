package lambdas;

import java.util.function.Predicate;

public class P6PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar =  num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
//		System.out.println(isPar.and(isTresDigitos).negate().test(32));
		System.out.println(isPar.or(isTresDigitos).test(131));
		System.out.println(isPar.or(isTresDigitos).test(132)); // Não deveria ser verdadeiro?
		System.out.println(isPar.or(isTresDigitos).test(31));
		System.out.println(isPar.or(isTresDigitos).test(32));
//		System.out.println(isPar.and(isTresDigitos).negate().test(32));
//		System.out.println(isTresDigitos.test(252));
		
		
	}
	
}
