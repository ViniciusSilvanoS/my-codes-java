package Capitulo1;

import java.util.Random;

public class P2CriandoArray {

	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		
		String[] pets = {"Fido", "Zeus", "Bin"};
		
		int x = pets.length;
		x = randomGenerator.nextInt(x);
		
		String s = pets[0];
		s = s + " " + "is a dog";
		
		System.out.println(s);
	}
	
}
