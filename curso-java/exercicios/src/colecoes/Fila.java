package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		// Fila
		Queue<String> fila = new LinkedList<>();
		
		// A única diferença entre add e offer é quando a fila está cheia!
		fila.add("Ana"); // Lança uma exceção
		fila.offer("Bia"); // Retorna true ou false
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafa");
		fila.offer("Gui");
		
		
//		// A única diferença é o erro que ocorre quando a fila está vazia
//		System.out.println(fila.peek()); // Retorna NULL
//		System.out.println(fila.peek());
//		System.out.println(fila.element()); // Lança uma exceção
//		System.out.println(fila.element());
//		
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
		
		
		// A única diferença é o erro que ocorre quando a fila está vazia
		System.out.println(fila.poll()); // Retorna NULL
		System.out.println(fila.remove()); // Retorna uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());		
		
		
		
//		for(String nome: fila) {
//			System.out.println();
//		}
		
		
	}
	
}
