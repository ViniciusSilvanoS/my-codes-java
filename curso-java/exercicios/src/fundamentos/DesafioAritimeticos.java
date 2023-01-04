package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		double va = Math.pow(6*(3+2), 2);
		va = va / (3*2);
		
		double vb = ((1-5)*(2-7))/2;
		vb = Math.pow(vb, 2);
		
		double vt = va - vb;
		vt = Math.pow(vt, 3);
		vt = vt / Math.pow(10, 3);
		
		System.out.printf("O valor total é %.0f", vt);
	}
	
}
