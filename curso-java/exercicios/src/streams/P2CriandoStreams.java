package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class P2CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		System.out.println("Forma 1 ------------------------------------------------------");
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// ------------------------
		
		System.out.println("\nForma 2 ------------------------------------------------------");
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		
		System.out.println("\nForma 3 ------------------------------------------------------");
		Arrays.stream(maisLangs).forEach(print);
		
		System.out.println("\nForma 4 ------------------------------------------------------");
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		// ------------------------
		
		System.out.println("\n\nForma 5 ------------------------------------------------------");
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		System.out.println("\nForma 6 ------------------------------------------------------");
//		Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);
		
		
	}
	
}
