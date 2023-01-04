package classe;

public class AreaCircTeste {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.6);
		a1.pi = 10;
		System.out.println(a1.area());
		
		
		AreaCirc a2 = new AreaCirc(5.6);
		a2.pi = 5;
		System.out.println(a2.area());
		
		
		
		
	}
	
}
