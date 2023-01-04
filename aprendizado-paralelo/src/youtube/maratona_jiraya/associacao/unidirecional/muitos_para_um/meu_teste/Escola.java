package youtube.maratona_jiraya.associacao.unidirecional.muitos_para_um.meu_teste;

import java.util.List;

public class Escola {

	private String nome;
	private List<Professor> professores;
	
	
	
	public Escola(String nome) {
		super();
		this.nome = nome;
	}
	
	public Escola(String nome, List<Professor> professores) {
		super();
		this.nome = nome;
		this.professores = professores;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
}
