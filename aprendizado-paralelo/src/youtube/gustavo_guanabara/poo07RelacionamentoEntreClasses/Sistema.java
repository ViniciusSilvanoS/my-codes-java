package youtube.gustavo_guanabara.poo07RelacionamentoEntreClasses;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		
		List<Lutador> lut = new ArrayList<>();
	
		lut.add(new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1));
		lut.add(new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3));
		lut.add(new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1));
		lut.add(new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2));
		
		System.out.println(lut.get(0).status());
		
//		for(Lutador luta: lut) {
//			System.out.println(luta.apresentar());
//		}
		
	}
}
