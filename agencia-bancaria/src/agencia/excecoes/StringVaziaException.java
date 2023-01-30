package agencia.excecoes;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	// Valida se a informação inserida está vazia. Ou seja não foi digitado nada e foi dado OK
	
	private String nomeDoAtributo;

	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}
	
}
