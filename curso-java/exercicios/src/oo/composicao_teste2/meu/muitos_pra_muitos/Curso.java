package oo.composicao_teste2.meu.muitos_pra_muitos;

import java.util.HashSet;
import java.util.Set;

public class Curso {

	private String nome;
	private final Set<Aluno> alunos;
	
	
	public Curso(String nome) {
		super();
		this.nome = nome;
		this.alunos = new HashSet<>();
	}

	// -------------------
	
//	void 
	
	/* Obs.: Fiz addAluno e addAlunoComposicao para não criar um loop. 
	 * Já que na aula o professor não colocar os arrays como privado e insere diretamente*/
	void addAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.addCursoComposicao(this);
	}
	
	void addAlunoComposicao(Aluno aluno) {
		alunos.add(aluno);
	}
	
	// -------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	
	
}
