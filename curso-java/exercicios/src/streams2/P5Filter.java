package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class P5Filter {

	public static void main(String[] args) {
		
		P5Aluno a1 = new P5Aluno("Ana", 7.8);
		P5Aluno a2 = new P5Aluno("Bia", 5.8);
		P5Aluno a3 = new P5Aluno("Dani", 9.8);
		P5Aluno a4 = new P5Aluno("Gui", 6.8);
		P5Aluno a5 = new P5Aluno("Pedro", 7.1);
		P5Aluno a6 = new P5Aluno("Rebeca", 8.8);
		
		List<P5Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<P5Aluno> isAprovado = a -> a.nota >= 7;
		Function<P5Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
				
		alunos.stream()
			.filter(isAprovado)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
			
		
	}
	
}
