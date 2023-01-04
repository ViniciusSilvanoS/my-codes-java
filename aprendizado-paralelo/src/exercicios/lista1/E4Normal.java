package exercicios.lista1;

public class E4Normal {

	public static void main(String[] args) {
		
		float porcentIPI = 1.1f;
		
		double v1 = 10.0;
		int qtd1 = 2;
		
		double v2 = 5.0;
		int qtd2 = 5;
		
		double total = ((v1*qtd1)+(v2*qtd2))*porcentIPI;
				
		System.out.printf("Valor total é: %.2f", total);
		
	}
	
}
