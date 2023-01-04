package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P5Function {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		UnaryOperator<String> empolgado = valor -> valor + "!!!"; /* Coloquei um unario aqui só pra mostrar 
		que se a entrada e a saida forem do mesmo tipo ele pode ser usado */

		Function<String, String> duvida = valor -> valor + "???";

		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(33);
		System.out.println(resultadoFinal1);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
		System.out.println(resultadoFinal2);

		System.out.println(parOuImpar.apply(32));

	}

}
