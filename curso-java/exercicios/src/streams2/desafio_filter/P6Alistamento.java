package streams2.desafio_filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class P6Alistamento {

	public static void main(String[] args) {
		
		P6Pessoa p1 = new P6Pessoa("Julia", 'f', 16);
		P6Pessoa p2 = new P6Pessoa("Roberto", 'm', 25);
		P6Pessoa p3 = new P6Pessoa("Rogerio", 'm', 18);
		P6Pessoa p4 = new P6Pessoa("Rafaela", 'f', 18);
		P6Pessoa p5 = new P6Pessoa("Guilherme", 'm', 16);
		P6Pessoa p6 = new P6Pessoa("Daniela", 'f', 28);
		
		List<P6Pessoa> pessoas = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<P6Pessoa> maiorDeIdade = i -> i.getIdade() >= 18;
		Predicate<P6Pessoa> isMasculino = s -> s.getSexo() == 'm';
		Function<P6Pessoa, String> alistamento = a -> a.getIdade() == 18 ?
			a.getNome() + " está na idade de se alistar" :
			a.getNome() + " já passou a idade de se alistar";
		
		pessoas.stream()
			.filter(maiorDeIdade)
			.filter(isMasculino)
			.map(alistamento)
			.forEach(System.out::println);
	}
	
}
