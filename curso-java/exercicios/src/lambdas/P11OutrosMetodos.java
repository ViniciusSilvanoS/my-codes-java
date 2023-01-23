package lambdas;

import java.util.Arrays;
import java.util.List;

import streams2.P8Aluno;

public class P11OutrosMetodos {

	public static void main(String[] args) {
		
		P8Aluno a1 = new P8Aluno("Ana", 7.1);
		P8Aluno a2 = new P8Aluno("Luna", 6.1);
		P8Aluno a3 = new P8Aluno("Gui", 8.1);
		P8Aluno a4 = new P8Aluno("Gabi", 10);
		P8Aluno a5 = new P8Aluno("Ana", 7.1);
		P8Aluno a6 = new P8Aluno("Pedro", 6.1);
		P8Aluno a7 = new P8Aluno("Gui", 8.1);
		P8Aluno a8 = new P8Aluno("Maria", 10);
		
		List<P8Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.getNota() >= 7)
			.forEach(System.out::println);
		
		
	}
	
}
