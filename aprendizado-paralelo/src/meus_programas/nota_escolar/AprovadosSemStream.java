package meus_programas.nota_escolar;

import java.util.ArrayList;
import java.util.List;

public class AprovadosSemStream {

	// criar uma array de alunos em objeto e selecionar quais estão aprovados em sem usar stream
	// Aprovados, Reprovados, em Recuperação. Homem e Mulher
			
	public static void main(String[] args) {
		List<Aluno> alunos = getAluno();
		
		List<Aluno> aprovados = new ArrayList<>();
		List<Aluno> reprovados = new ArrayList<>();
		List<Aluno> recuperacao = new ArrayList<>();
		
		//aprovados, reprovados, recuperação
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getNota() >= 7) {
				aprovados.add(alunos.get(i));				
			}else if(alunos.get(i).getNota() < 5) {
				reprovados.add(alunos.get(i));
			}else {
				recuperacao.add(alunos.get(i));
			}
		}
		
		StringBuilder sbh = new StringBuilder();
		sbh.append("--- HOMENS ---\n");
		
		sbh.append("Aprovados: \n");
		for(Aluno aluno: aprovados) {
			if(aluno.getGenero().equals(Genero.HOMEM)) {
				sbh.append(aluno.toString() + "\n");
			}
		}
		
		sbh.append("\nRecuperação: \n");
		for(Aluno aluno: recuperacao) {
			if(aluno.getGenero().equals(Genero.HOMEM)) {
				sbh.append(aluno.toString() + "\n");
			}
		}
		
		sbh.append("\nReprovados: \n");
		for(Aluno aluno: reprovados) {
			if(aluno.getGenero().equals(Genero.HOMEM)) {
				sbh.append(aluno.toString() + "\n");
			}
		}
		
		System.out.println(sbh);
		
		//// ----------------------------------------------------

		StringBuilder sbm = new StringBuilder();
		sbm.append("--- MULHERES ---\n");
		
		sbm.append("Aprovados: \n");
		for(Aluno aluno: aprovados) {
			if(aluno.getGenero().equals(Genero.MULHER)) {
				sbm.append(aluno.toString() + "\n");
			}
		}
		
		sbm.append("\nRecuperação: \n");
		for(Aluno aluno: recuperacao) {
			if(aluno.getGenero().equals(Genero.MULHER)) {
				sbm.append(aluno.toString() + "\n");
			}
		}
		
		sbm.append("\nReprovados: \n");
		for(Aluno aluno: reprovados) {
			if(aluno.getGenero().equals(Genero.MULHER)) {
				sbm.append(aluno.toString() + "\n");
			}
		}
		
		System.out.println();
		System.out.println(sbm);
		
	}
	
	private static List<Aluno> getAluno(){
		
		return List.of(
			new Aluno("James Bond", 20, Genero.HOMEM, 10),
			new Aluno("Alina Smith", 33, Genero.MULHER, 8),
			new Aluno("Helen White", 57, Genero.MULHER, 2),
			new Aluno("Alex Boz", 14, Genero.HOMEM, 5),
			new Aluno("Jamie Goa", 99, Genero.MULHER, 9),
			new Aluno("Anna Cook", 7, Genero.MULHER, 6),
			new Aluno("Zelda Brown", 120, Genero.MULHER, 4),
			new Aluno("Rodrigo Alberto", 32, Genero.HOMEM, 2)
		);
		
	}
	
}
