package streams2.youtube_amigoscode_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = getPessoa();
		
		// Filter
		List<Pessoa> mulheres = pessoas.stream()
			.filter(pessoa -> pessoa.getGenero().equals(Genero.MULHER))
			.collect(Collectors.toList());
//		mulheres.forEach(System.out::println);
		
		// Sort
		List<Pessoa> ordemIdade = pessoas.stream()
			.sorted(Comparator.comparing(Pessoa::getIdade).thenComparing(Pessoa::getGenero).reversed()) /* thenComparing faz a segunda comparação 
																										reversed coloca ordem ao contrário*/
			.collect(Collectors.toList());
//		ordemIdade.forEach(System.out::println);
		
		// All match (Se tiver todos valores que estejam dentro do critério dará verdadeiro)
		boolean allMatch = pessoas.stream()
			.allMatch(pessoa -> pessoa.getIdade() > 5);
//		System.out.println(allMatch);
		
		// Any match (Se tiver qualquer valor que esteja dentro do critério dará verdadeiro)
		boolean anyMatch = pessoas.stream()
				.anyMatch(pessoa -> pessoa.getIdade() > 50);
//		System.out.println(anyMatch);
		
		// None match
		boolean noneMatch = pessoas.stream()
				.noneMatch(pessoa -> pessoa.getNome().equals("Antonio"));
//		System.out.println(noneMatch);
		
		// Max
		pessoas.stream()
			.max(Comparator.comparing(Pessoa::getIdade));
//			.ifPresent(System.out::println);
		
		// Min
		pessoas.stream()
			.min(Comparator.comparing(Pessoa::getIdade));
//			.ifPresent(System.out::println);
		
		// Group
		Map<Genero, List<Pessoa>> grupoPorGenero = pessoas.stream()
			.collect(Collectors.groupingBy(Pessoa::getGenero));
		grupoPorGenero.forEach((genero, pessoa1) -> {
			System.out.println(genero);
			pessoa1.forEach(System.out::println);
			System.out.println();
		});
		
	}
	
	private static List<Pessoa> getPessoa(){
		
		return List.of(
			new Pessoa("James Bond", 20, Genero.HOMEM),
			new Pessoa("Alina Smith", 33, Genero.MULHER),
			new Pessoa("Helen White", 57, Genero.MULHER),
			new Pessoa("Alex Boz", 14, Genero.HOMEM),
			new Pessoa("Jamie Goa", 99, Genero.MULHER),
			new Pessoa("Anna Cook", 7, Genero.MULHER),
			new Pessoa("Zelda Brown", 120, Genero.MULHER)
		);
		
	}
	
}
