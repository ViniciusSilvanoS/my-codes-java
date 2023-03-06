package generics.p4_heranca_retricao;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(5.5);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(3);
		System.out.println(caixaB.abrir());
		
	}
	
}
