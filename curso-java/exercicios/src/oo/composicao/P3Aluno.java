package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class P3Aluno {

	final String nome;
	final List<P3Curso> cursos = new ArrayList<>();

	P3Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(P3Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	P3Curso obterCursoPorNome(String nome) {
		for (P3Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}

		return null;

	}

//	public String toString() {
//		return nome;
//	}

}
