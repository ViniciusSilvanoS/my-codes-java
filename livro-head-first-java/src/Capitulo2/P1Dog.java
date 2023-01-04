package Capitulo2;

public class P1Dog {

	String nome;
	String raca;
	int tamanho;
	
	void bark() {
		System.out.println("au au");
	}
	
	void inf(P1Dog dog) {
		System.out.println(dog.nome);
		System.out.println(dog.raca);
		System.out.println(dog.tamanho);
	}
	
	
}
