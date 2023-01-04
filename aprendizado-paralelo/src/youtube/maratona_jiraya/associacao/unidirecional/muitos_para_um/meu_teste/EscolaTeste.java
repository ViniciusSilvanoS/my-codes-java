package youtube.maratona_jiraya.associacao.unidirecional.muitos_para_um.meu_teste;

import java.util.ArrayList;
import java.util.List;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor("José");
		Professor professor2 = new Professor("João");
		
		List<Professor> professores = new ArrayList<>();
		professores.add(professor1);
		professores.add(professor2);
		
		Escola escola1 = new Escola("Castro Alvez", professores);
		
		System.out.println(escola1.getNome() + ": ");
		for(Professor professor: escola1.getProfessores()) {
			System.out.print(professor.getNome() + ", ");
		}
		
	}
	
}
