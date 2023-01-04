package youtube.alura.gerenciando_cursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "sla 1";
		String aula2 = "sla 2";
		String aula3 = "sla 3";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("get: " + aulas.get(0));
		
//		aulas.remove(1);
//		System.out.println(aulas.size());
		
		aulas.add("a sla 4");
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		System.out.print("\n---------------\n\n");
		Collections.sort(aulas);
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
	}
	
}
