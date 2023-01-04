package oo.composicao;

public class P3CursoTeste {

	public static void main(String[] args) {
		
		P3Aluno aluno1 = new P3Aluno("João");
		P3Aluno aluno2 = new P3Aluno("Mario");
		P3Aluno aluno3 = new P3Aluno("Pedro");
		
		P3Curso curso1 = new P3Curso("Java Completo");
		P3Curso curso2 = new P3Curso("Web 2023");
		P3Curso curso3 = new P3Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(P3Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("...meu nome é " + aluno.nome + "\n");
		}
		
		System.out.println("-------------\n");
		
		for(P3Curso curso: aluno1.cursos) {
			System.out.println("Aluno: " + aluno1.nome + "\nCursos: " + curso.nome + "\n");
		}
		
//		System.out.println(curso1.alunos.get(0));
//		System.out.println(aluno1.cursos.get(0).alunos);
//		
//		System.out.println(curso1.alunos.get(0).cursos);
//		System.out.println(aluno1.cursos.get(0));
		
//		P3Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
//		
//		if(cursoEncontrado != null) {
//			System.out.println(cursoEncontrado.alunos);
//		}
		
//		System.out.println(aluno3);
//		System.out.println(curso1.alunos);
		
		
	}
	
}
