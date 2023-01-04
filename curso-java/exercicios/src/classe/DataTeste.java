package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Data d1 = new Data();
		
		Data d2 = new Data(31, 12, 2020);
		
		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());
		
		
		

		scanner.close();

	}
	
}
