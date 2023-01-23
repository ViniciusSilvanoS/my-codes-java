package excecao.personalizadaA;

@SuppressWarnings("serial")
public class P3NumeroForaIntervaloException extends RuntimeException {

	private String nomeDoAtributo;
	
	public P3NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
	}
	
}
