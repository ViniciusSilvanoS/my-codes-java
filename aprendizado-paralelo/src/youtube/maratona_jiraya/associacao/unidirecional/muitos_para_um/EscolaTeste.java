package youtube.maratona_jiraya.associacao.unidirecional.muitos_para_um;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Professor professor = new Professor("Jiraya");
		Professor professor2 = new Professor("Kakashi");
		Professor[] professores = {professor, professor2};
		Escola escola = new Escola("Konoha", professores);
		
		escola.imprime();
		
	}
	
}
