package youtube.ze_codes_projetos.agencia_meu.excecoes;

public class StringNulaException extends RuntimeException {

	// Valida se o usuário clicou em cancelar no JOptionPane.showInputDialog()
	
	private String nomeDoAtributo;

	
	public StringNulaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está nulo", nomeDoAtributo);
	}
	
}
