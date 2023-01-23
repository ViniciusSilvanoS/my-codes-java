package excecao.personalizadaA;

public class P3Validar {

	private P3Validar() {}
	
	public static void aluno(P3Aluno aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new P3StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new P3NumeroForaIntervaloException("nota");
		}
		
	}
	
}
