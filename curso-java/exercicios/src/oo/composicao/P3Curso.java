package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class P3Curso {

	final String nome;
	final List<P3Aluno> alunos = new ArrayList<>();
	
	P3Curso (String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(P3Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
//	public String toString() {
//		return nome;
//	}
	
}
