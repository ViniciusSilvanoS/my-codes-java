package youtube.Loiane_Groner.tratamento_de_erros;

@SuppressWarnings("serial")
public class P7DivisaoNaoExata extends Exception {

	private int num;
	private int denom;
	
	public P7DivisaoNaoExata(int num, int den) {
		super();
		this.num = num;
		this.denom = den;
	}

	@Override
	public String toString() {
		return "Restultado de " + num + "/" + denom + " não é um inteiro!";
	}
	
	
	
}
