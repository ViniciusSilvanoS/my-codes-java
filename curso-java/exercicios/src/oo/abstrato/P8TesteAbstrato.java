package oo.abstrato;

public class P8TesteAbstrato {

	public static void main(String[] args) {
		
		P8Mamifero a = new P8Cachorro();
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
		
	}
	
}
