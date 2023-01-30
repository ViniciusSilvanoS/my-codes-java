package agencia.programa;

import agencia.excecoes.StringNulaException;
import agencia.excecoes.StringVaziaException;

public class Validar {

	public static void pessoa(Pessoa pessoa) {
		
		if(pessoa == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		
		if(pessoa.getNome() == null) {
			throw new StringVaziaException("nome");
		}
		
		if(pessoa.getNome().trim().isEmpty()) {
			throw new StringNulaException("nome");
		}
		
		
		if(pessoa.getCpf() == null) {
			throw new StringVaziaException("CPF");
		}
		
		if(pessoa.getCpf().trim().isEmpty()) {
			throw new StringVaziaException("CPF");
		}
		
		
		if(pessoa.getEmail() == null) {
			throw new StringVaziaException("email");
		}
		if(pessoa.getEmail().trim().isEmpty()) {
			throw new StringVaziaException("email");
		}
		
	}
	
	
	public static void stringVazio(String valor, String nomeDoAtributo) {
		
		if(valor == null) {
			throw new StringNulaException(nomeDoAtributo);
		}
		
		if(valor.trim().isEmpty()) {
			throw new StringVaziaException(nomeDoAtributo);
		}
		
	}
	
	

	
}
