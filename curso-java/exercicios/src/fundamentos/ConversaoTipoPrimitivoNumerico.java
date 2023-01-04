package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.3455; // Explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);
		
	}
	
}
