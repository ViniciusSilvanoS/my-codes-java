package excecao;

import streams2.P5Aluno;

public class P1Bascio {

	public static void main(String[] args) {
		
		P5Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Ocorrreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
	public static void imprimirNomeDoAluno(P5Aluno aluno) {
		
		System.out.println(aluno.getNome());
		
	}
	
}
