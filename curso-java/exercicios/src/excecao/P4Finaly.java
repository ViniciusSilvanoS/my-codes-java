package excecao;

import java.util.Scanner;

public class P4Finaly {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(7 / scanner.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally...");
			scanner.close();
		}
		
		System.out.println("Fim!");
		
	}
	
}
