package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P4Consumer {

	public static void main(String[] args) {
		
		Consumer<P3Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		
		P3Produto p1 = new P3Produto("Caneta", 12.34, 0.9);
		imprimirNome.accept(p1);
		
		P3Produto p2 = new P3Produto("Notebook", 2987.99, 0.25);
		P3Produto p3 = new P3Produto("Caderno", 19.90, 0.03);
		P3Produto p4 = new P3Produto("Borracha", 07.80, 0.18);
		P3Produto p5 = new P3Produto("Lapis", 04.39, 0.19);
		
		List<P3Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}
	
}
