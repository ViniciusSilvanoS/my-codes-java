package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Vinícius", "Silvano", 20);
		p1.setIdade(150);
		
		System.out.println(p1.getIdade());
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());
		
	}
	
}
