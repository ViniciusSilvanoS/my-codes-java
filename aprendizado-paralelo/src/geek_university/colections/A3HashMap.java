package geek_university.colections;

import java.util.HashMap;
import java.util.Map;

public class A3HashMap {

	public static void main(String[] args) {
		Map<String, Double> contas = new HashMap<>();
		
		contas.put("1", 45.50);
		
		
		System.out.println(contas.entrySet());
		
	}
	
}
