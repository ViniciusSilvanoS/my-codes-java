package meus_programas.nota_escolar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AprovadosComStream {

	// criar uma array de alunos em objeto e selecionar quais estão aprovados em sem usar stream
	// Aprovados, Reprovados, em Recuperação. Homem e Mulher
	
	public static void main(String[] args) {
		List<Aluno> alunos = getAluno();
		
		List<Aluno> aprovados = new ArrayList<>();
		List<Aluno> reprovados = new ArrayList<>();
		List<Aluno> recuperacao = new ArrayList<>();
		
		aprovados = alunos.stream()
			.filter(a -> a.getNota() >= 7)
			.collect(Collectors.toList());
		
		recuperacao = alunos.stream()
				.filter(a -> a.getNota() >= 5 && a.getNota() < 7)
				.collect(Collectors.toList());
		
		reprovados = alunos.stream()
				.filter(a -> a.getNota() < 5)
				.collect(Collectors.toList());
		
		System.out.println("--- HOMENS ---\n");
		System.out.println("Aprovados:");
		aprovados.stream()
			.filter(a -> a.getGenero().equals(Genero.HOMEM))
			.forEach(a -> System.out.println(a.toString()));
		
		System.out.println("\nRecuperação:");
		recuperacao.stream()
			.filter(a -> a.getGenero().equals(Genero.HOMEM))
			.forEach(a -> System.out.println(a.toString()));

		System.out.println("\nReprovados:");
		reprovados.stream()
		.filter(a -> a.getGenero().equals(Genero.HOMEM))
		.forEach(a -> System.out.println(a.toString()));
		
		
		System.out.println("\n\n--- MULHERES ---\n");
		System.out.println("Aprovados:");
		aprovados.stream()
			.filter(a -> a.getGenero().equals(Genero.MULHER))
			.forEach(a -> System.out.println(a.toString()));
		
		System.out.println("\nRecuperação:");
		recuperacao.stream()
			.filter(a -> a.getGenero().equals(Genero.MULHER))
			.forEach(a -> System.out.println(a.toString()));

		System.out.println("\nReprovados:");
		reprovados.stream()
		.filter(a -> a.getGenero().equals(Genero.MULHER))
		.forEach(a -> System.out.println(a.toString()));
		
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
