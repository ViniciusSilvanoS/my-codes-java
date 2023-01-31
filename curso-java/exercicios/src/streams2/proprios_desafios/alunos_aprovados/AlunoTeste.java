package streams2.proprios_desafios.alunos_aprovados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AlunoTeste {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		alunos.add(new Aluno("Vinicius", 8));
		alunos.add(new Aluno("Guilherme", 3));
		alunos.add(new Aluno("Bia", 10));
		alunos.add(new Aluno("Jessica", 5));
		alunos.add(new Aluno("Renan", 2));
		
		alunos.stream().filter(aluno -> aluno.getNota() >= 7).map(aluno -> aluno.getNome() +
					" foi aprovado e tirou nota " + aluno.getNota()).forEach(System.out::println);;
//		alunos.stream().map(c -> c.getNota() >= 7).forEach(c -> System.out.println(c.getN));
		
	}
	
}
