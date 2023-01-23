package POO;

public class P1HerancaTeste {

	public static void main(String[] args) {
		
		P1Carro c1 = new P1Carro();
		
		c1.setAro(13);
		c1.setVelocidade(220);
		c1.setAssento(4);
		c1.setPeso(10000);
		
		System.out.println(c1.toString());
		
	}
	
}
