package oo.composicao_teste2.meu.muitos_pra_muitos;

import java.util.HashSet;
import java.util.Set;

public class Aluno {

	private final String nome;
	private final Set<Curso> cursos;
	
	
	
	public Aluno(String nome) {
		super();
		this.nome = nome;
		cursos = new HashSet<>();
	}

	// -------------------
	
	/* Obs.: Fiz addCurso e addCursoComposicao para não criar um loop. 
	 * Já que na aula o professor não colocar os arrays como privado e insere diretamente*/
	void addCurso(Curso curso){
		cursos.add(curso);
		curso.addAlunoComposicao(this);
	}
	
	void addCursoComposicao(Curso curso) {
		cursos.add(curso);
	}
	
	Curso obterCursoPorNome(String nome) {
		
		for(Curso curso: this.cursos) {
			if(curso.getNome().equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	// -------------------
	
	public String getNome() {
		return nome;
	}

	
}
