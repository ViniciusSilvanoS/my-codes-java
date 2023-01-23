package youtube.Loiane_Groner.tratamento_de_erros;

public class DivisaoNaoExataExcecao extends Exception {

	private int num;
	private int den;
	
	public DivisaoNaoExataExcecao(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + den + " não é um inteiro!";
	}
	
	
	
}
