package excecao;

public class P2ChecadaVsNãoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
		
	}
	
	// Exceção não verificada/checada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// Exceção checada/verificada porque causa erro antes mesmo de executar
	static void geraErro2() throws Exception {
		
		throw new Exception("Ocorreu um erro bem legal #02");
		
	}
	
}
