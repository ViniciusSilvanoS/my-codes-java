package streams2;

public class P9Media {

	private double total;
	private int quantidade;
	
	public P9Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getMedia() {
		return total / quantidade;
	}
	
	public static P9Media combinar(P9Media m1, P9Media m2) {
		P9Media resultante = new P9Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
	
}
