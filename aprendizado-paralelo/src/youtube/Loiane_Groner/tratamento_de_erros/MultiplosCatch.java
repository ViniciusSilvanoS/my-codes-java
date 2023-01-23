package youtube.Loiane_Groner.tratamento_de_erros;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 5, 6, 7};
		int[] denom = {5, 0, 7, 8, 0};
		
		for(int i = 0; i < num.length; i++) {
			try {
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i]/denom[i]));
			} catch (ArithmeticException e) {
				System.out.println("ERRO: Está dividindo por zero");
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("ERRO: Está acessando uma posição inexistente");
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
}
