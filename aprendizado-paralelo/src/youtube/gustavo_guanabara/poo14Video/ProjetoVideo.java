package youtube.gustavo_guanabara.poo14Video;

import java.util.ArrayList;

public class ProjetoVideo {

	public static void main(String[] args) {
		
//		Video v[] = new Video[3];
		ArrayList<Video> v = new ArrayList<>();
		
//		v[0] = new Video("Aula 1 de POO");
//		v[1] = new Video("Aula 3 de FLEX-BOX");	
//		v[2] = new Video("Aula 2 de DOM");
		v.add(new Video("Aula 1 de POO"));
		v.add(new Video("Aula 3 de FLEX-BOX"));
		v.add(new Video("Aula 2 de DOM"));
		
//		Usuario u[] = new Usuario[2];
		ArrayList<Usuario> u = new ArrayList<>();
		
//		u[0] = new Usuario ("Rodrigo", 32, 'M', "Rod");
//		u[1] = new Usuario ("Bianca", 26, 'F', "Bia");
		u.add(new Usuario("Rodrigo", 32, 'M', "Rod"));
		u.add(new Usuario("Bianca", 26, 'F', "Bia"));
		
		System.out.println(v.get(0).toString());
		System.out.println(u.get(0).toString());
		
	}
	
}
