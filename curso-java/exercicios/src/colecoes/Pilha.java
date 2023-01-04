package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		// A única diferença entre add e offer é quando a fila está cheia!
		livros.add("O pequeno Principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println("-----------------------------------------------------------------");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		// A única diferença é o erro que ocorre quando a fila está vazia
		System.out.println(livros.poll()); // Retorna NULL
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop()); // Retorna erro
//		System.out.println(livros.remove()); // Retorna erro
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
		
		
		
	}
	
}
