package exercicios.lista1.E4ObjetoArray;


public class E4Teste {

	public static void main(String[] args) {
		
		float porcentIPI = 1.1f;
		
		E4 p1 = new E4(1);
		E4 p2 = new E4(2);
		
		p1.setValor(10.0);
		p1.setQuantidade(2);
		
		p2.setValor(5.0);
		p2.setQuantidade(5);
		
		System.out.printf("O valor total é: %.2f", p1.totalIPI(porcentIPI) + p2.totalIPI(porcentIPI));
		
		
	}
	
}
