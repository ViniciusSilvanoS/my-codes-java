package youtube.ze_codes_projetos.agencia_meu.excecoes;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String nomeDoAtributo;

	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomeDoAtributo);
	}
	
}
