package classe.CursoEmVideo;

public class Principal {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		c1.tampar();
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		
	}
	
}
