package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10000; //OU i = Integer.parseInt(entrada.next());
		Long l = 100000L;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		Integer a = 2;
		String ab = a.toString();
		System.out.println(ab);
		
		
		entrada.close();
		
	}
	
}
