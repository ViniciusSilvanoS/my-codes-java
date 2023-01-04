package exercicios.lista2;

public class Ei1 {

	public static void main(String[] args) {
		int j = 0;
		double total = 0;
		for(int i = 1; i < 100; i += 2) {
			j++;
			total += i/j;
		}
		
		System.out.println(total);
		
	}
	
}
