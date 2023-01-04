package lambdas;

import java.util.function.UnaryOperator;

public class P8UnaryOperator {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		int result1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
		System.out.println(result1);
	
		int result2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
		System.out.println(result2);
		
		
		
	}
}
