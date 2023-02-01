package br.com.projeto.campo_minado.excecao;

public class ExplosaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return String.format("Ocorreu uma explosão");
	}
	
}
