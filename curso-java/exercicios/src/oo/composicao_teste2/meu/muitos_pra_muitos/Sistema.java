package oo.composicao_teste2.meu.muitos_pra_muitos;

public class Sistema {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);
		
		curso3.addAluno(aluno2);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		System.out.println(curso3.getNome());
		for(Aluno aluno: curso3.getAlunos()) {
			System.out.print(aluno.getNome() + " | ");
		}
		System.out.println();
		
		// Aqui foi feito um teste para procurar um curso a partir do aluno.
		// Neste caso foi retornado o nome do curso. Mas em um caso mais útil poderia retornar outro dado
		Curso cursoEncontrado = aluno1.obterCursoPorNome("React Native");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.getNome());
		}
		
		
	}
	
}
