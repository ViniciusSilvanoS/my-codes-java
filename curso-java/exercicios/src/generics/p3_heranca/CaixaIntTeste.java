package generics.p3_heranca;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(123); 
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
	}
	
}
