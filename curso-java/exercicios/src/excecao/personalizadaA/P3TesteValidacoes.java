package excecao.personalizadaA;

public class P3TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			P3Aluno aluno = new P3Aluno("Ana", -7);
			P3Validar.aluno(aluno);
			
			P3Validar.aluno(null);
		} catch (P3StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (P3NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
}
