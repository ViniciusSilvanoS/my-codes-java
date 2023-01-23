package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P10Match {

	public static void main(String[] args) {
		
		P8Aluno a1 = new P8Aluno("Ana", 7.1);
		P8Aluno a2 = new P8Aluno("Luna", 6.1);
		P8Aluno a3 = new P8Aluno("Gui", 8.1);
		P8Aluno a4 = new P8Aluno("Gabi", 10);
		
		List<P8Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<P8Aluno> aprovado = a -> a.getNota() >= 7;
		Predicate<P8Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));
		System.out.println(alunos.stream().anyMatch(aprovado));
		System.out.println(alunos.stream().noneMatch(reprovado));
		
	}
	
}
