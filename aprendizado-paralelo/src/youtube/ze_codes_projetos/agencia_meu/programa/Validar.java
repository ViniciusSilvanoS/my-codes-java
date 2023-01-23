package youtube.ze_codes_projetos.agencia_meu.programa;

import youtube.ze_codes_projetos.agencia_meu.excecoes.StringVaziaException;

public class Validar {

	public static void pessoa(Pessoa pessoa) {
		
		if(pessoa == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(pessoa.getNome() == null || pessoa.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(pessoa.getCpf() == null || pessoa.getCpf().trim().isEmpty()) {
			throw new StringVaziaException("CPF");
		}
		
		if(pessoa.getEmail() == null || pessoa.getEmail().trim().isEmpty()) {
			throw new StringVaziaException("email");
		}
		
	}
	
	public static void 
	
	
}
