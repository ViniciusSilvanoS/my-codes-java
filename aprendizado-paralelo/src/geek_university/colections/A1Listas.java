package geek_university.colections;

import java.util.ArrayList;
import java.util.Collections;

public class A1Listas {

	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		
		nomes.add("Maria");
		nomes.add("Vinicius");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");

//		for(int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//		}
		Collections.sort(nomes);
		
		for(Object nome: nomes) {
			System.out.println(nome);
		}
		
		
//		
//		System.out.println(nomes.get(0));
		
	}
	
}
