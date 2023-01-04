package youtube.maratona_jiraya.associacao.unidirecional.um_para_muitos;

public class JogadorTeste {

	public static void main(String[] args) {
		
		Jogador jogador1 = new Jogador("Pelé");
		jogador1.imprime();
		
		System.out.println();
		
		Time time = new Time("Seleção Brasileira");
		jogador1.setTime(time);
		jogador1.imprime();
		
		
	}
	
}
