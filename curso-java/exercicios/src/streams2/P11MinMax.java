package streams2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P11MinMax {

	public static void main(String[] args) {
		
		P8Aluno a1 = new P8Aluno("Ana", 7.1);
		P8Aluno a2 = new P8Aluno("Luna", 6.1);
		P8Aluno a3 = new P8Aluno("Gui", 8.1);
		P8Aluno a4 = new P8Aluno("Gabi", 10);
		
		List<P8Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<P8Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota()) return 1;
			if(aluno1.getNota() < aluno2.getNota()) return -1;
			return 0;
		};
		
		Comparator<P8Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.getNota() > aluno2.getNota()) return -1;
			if(aluno1.getNota() < aluno2.getNota()) return 1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
		
		System.out.println(alunos.stream().min(melhorNota).get());
		System.out.println(alunos.stream().max(piorNota).get());
		
	}
	
}
