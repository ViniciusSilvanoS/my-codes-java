package streams2;

public class P9MediaTeste {

	public static void main(String[] args) {
		
		P9Media m1 = new P9Media().adicionar(8.3).adicionar(6.7); // Outra forma de adicionar um objeto. Isso por conta da classe com returno P9Media
		P9Media m2 = new P9Media().adicionar(7.9).adicionar(6.6);
		
		System.out.println(m1.getMedia());
		System.out.println(m2.getMedia());
		
		System.out.println("Média final: " + P9Media.combinar(m1, m2).getMedia());
		
		
	}
	
}
