package geek_university.colections;

import java.util.ArrayList;
import java.util.Collections;

public class A1Listas2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(24);
		numeros.add(12);
		numeros.add(2);
		numeros.add(91);
		
		Collections.sort(numeros);
//		System.out.println(numeros.get(1));
		
		for(int num: numeros) {
			System.out.println(num);
		}
		
		
	}
	
}
