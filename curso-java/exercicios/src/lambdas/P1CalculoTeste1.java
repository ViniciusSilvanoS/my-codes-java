package lambdas;

public class P1CalculoTeste1 {

	public static void main(String[] args) {
		
		P1Calculo calculo = new P1Somar();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new P1Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
	}
	
}
