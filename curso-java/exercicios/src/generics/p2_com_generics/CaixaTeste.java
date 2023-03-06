package generics.p2_com_generics;

import generics.p1_sem_generics.CaixaObjeto;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!");
		
		System.out.println(caixaA.abrir());
		
		
		Caixa<Integer> caixaB = new Caixa<>();
		caixaB.guardar(159);
		
		System.out.println(caixaB.abrir());
		
	}
	
}
