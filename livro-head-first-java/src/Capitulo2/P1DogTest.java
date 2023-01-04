package Capitulo2;

public class P1DogTest {

	public static void main(String[] args) {
		
		P1Dog d1 = new P1Dog();
		
		d1.nome = "Urso";
		d1.raca = "Poodle";
		d1.tamanho = 3;
		
		d1.bark();
		
		d1.inf(d1);
		
	}
	
	
}
