package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class P8Reduce2 {

	public static void main(String[] args) {
		
		P8Aluno a1 = new P8Aluno("Ana", 7.1);
		P8Aluno a2 = new P8Aluno("Luna", 6.1);
		P8Aluno a3 = new P8Aluno("Gui", 8.1);
		P8Aluno a4 = new P8Aluno("Gabi", 10);
		
		List<P8Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<P8Aluno> aprovado = a -> a.getNota() >= 7;
		Function<P8Aluno, Double> apenasNota = a -> a.getNota();
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		

		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
	}
	
}
