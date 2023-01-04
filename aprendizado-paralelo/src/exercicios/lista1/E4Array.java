package exercicios.lista1;

public class E4Array {

	public static void main(String[] args) {
		
		float porcentIPI = 1.1f;
		
		double[] pc1 = new double[2];
		double[] pc2 = new double[2];
		
		pc1[0] = 10.0;
		pc1[1] = 2;
		
		pc2[0] = 5.0;
		pc2[1] = 5;
		
		double total = ((pc1[0] * pc1[1]) + (pc2[0] * pc2[1])) * porcentIPI;
		
		System.out.printf("O total é: %.2f", total);
		
	}
	
}
