package excecao.personalizadaA;

@SuppressWarnings("serial")
public class P3StringVaziaException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public P3StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
		
	}
	
}
