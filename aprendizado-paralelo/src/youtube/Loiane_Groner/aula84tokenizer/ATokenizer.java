package youtube.Loiane_Groner.aula84tokenizer;

import java.util.StringTokenizer;

public class ATokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1-Antonio-30";
		
		StringTokenizer st = new StringTokenizer(doArquivo, "-");
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "");
		}
		
	}
	
}
