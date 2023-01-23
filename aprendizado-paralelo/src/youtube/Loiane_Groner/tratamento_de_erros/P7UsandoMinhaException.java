package youtube.Loiane_Groner.tratamento_de_erros;

public class P7UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] num = {1, 8, 10, 27, 64, 128, 256};
		int[] denom = {2, 0, 6, 8, 0};
		
		for(int i = 0; i < num.length; i++) {
			try {
				System.out.println("\nNumero: " + num[i]);
				if(num[i] % 2 != 0) {
					//lançar a exception aqui
					throw new P7DivisaoNaoExata(num[i], denom[i]);
				}
				System.out.println(num[i] + "/" + denom[i] + " = " + (num[i]/denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | P7DivisaoNaoExata e) {
				System.out.println("Aconteceu um erro");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
