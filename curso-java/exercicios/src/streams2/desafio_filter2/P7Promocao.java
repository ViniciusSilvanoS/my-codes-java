package streams2.desafio_filter2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class P7Promocao {

	public static void main(String[] args) {
		
		P7Produto p1 = new P7Produto("Violão", 40, 0);
		P7Produto p2 = new P7Produto("TV", 28, 0);
		P7Produto p3 = new P7Produto("Guitarra", 30, 0);
		P7Produto p4 = new P7Produto("PS5", 25, 40);
		P7Produto p5 = new P7Produto("XBOX", 40, 100);
		P7Produto p6 = new P7Produto("Monitor", 40, 0);
		
		List<P7Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<P7Produto> desconto = d -> d.getDesconto() >= 30;
		Predicate<P7Produto> freteGratis = f -> f.getFrete() == 0;
		Function<P7Produto, String> superDesconto = sd -> sd.getNome() + " está na SUPER PROMOÇÃO!!!";
		
		System.out.println("--- SUPER PROMOÇÃO ---\n");
		
		produtos.stream()
			.filter(desconto)
			.filter(freteGratis)
			.map(superDesconto)
			.forEach(System.out::println);
	}
	
}
